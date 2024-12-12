import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int N, M, F;
    static Pos start, end, wall, escape;
    static List<Pos> anomaly = new ArrayList<>();
    static int[][] ground, center, east, west, south, north, map;
    static int[] dr = {0,0,1,-1}, dc = {1,-1,0,0};  // 동서남북
    static class Pos{
        int r, c, d, v;
        public Pos(int r, int c, int d, int v) {
            this.r = r;
            this.c = c;
            this.d = d;
            this.v = v;
        }
    }

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine().trim());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        F = Integer.parseInt(st.nextToken());

        ground = new int[N][N];
        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < N; j++){
                ground[i][j] = Integer.parseInt(st.nextToken()) * -1;

                if (ground[i][j] == -4){       // 탈출구 위치 - 회전 고려 X
                    end = new Pos(i, j,0,0);
                    ground[i][j] = 0;
                }
            }
        }

        east = new int[M][M];
        west = new int[M][M];
        south = new int[M][M];
        north = new int[M][M];
        center = new int[M][M];
        inputTw(east);
        inputTw(west);
        inputTw(south);
        inputTw(north);
        inputTw(center);

        for (int i = 0; i < F; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            anomaly.add(new Pos(r, c, d, v));
        }

        printPos(start, "타임머신 좌표 (timewall)");
        printPos(end, "최종 탈출구 좌표");

        map = new int[M][4*M];

        bfsCenter();    // 윗면bfs
        bfsSide();      // 옆면bfs

        findWall();     // 지표면에서 시간의 벽 있는 부분 찾기
        findEscape();   // 시간의벽에서 지표면으로 내려오기

        int curT = ground[escape.r][escape.c];

        for (int i = 0; i < F; i++){
            Pos cur = anomaly.get(i);
            int time = cur.v;
            ground[cur.r][cur.c] = time * -1;
            while (time <= curT){
                cur.r = cur.r + dr[cur.d];
                cur.c = cur.c + dc[cur.d];
                if (ground[cur.r][cur.c] == -1) break;
                ground[cur.r][cur.c] = time * -1;
                System.out.println(cur.r+","+cur.c+" - "+(time*-1)+" => "+ground[cur.r][cur.c]);
                time += cur.v;
            }
        }

        bfsGround();    // 지표면 bfs

        System.out.println(ground[end.r][end.c]);
    }

    static void bfsGround(){
        boolean[][] visit = new boolean[N][N];
        Queue<Pos> q = new ArrayDeque<>();
        visit[escape.r][escape.c] = true;
        q.offer(new Pos(escape.r, escape.c, 0, ground[escape.r][escape.c]));

        int time = ground[escape.r][escape.c];
        while (!q.isEmpty()){
            time++;
            for (int i = 0; i < F; i++){
                Pos cur = anomaly.get(i);
                if (time %  cur.v == 0){
                    int nr = cur.r + dr[cur.d];
                    int nc = cur.c + dc[cur.d];
                    if (nr < 0 || nr >= N || nc < 0 || nc >= N || ground[nr][nc] < 0) continue;

                    ground[nr][nc] = time * -1;
//                    System.out.println("time = "+cur.v+"의 배수, ("+cur.r+", "+cur.c+") : " +cur.d+" >> "+ground[cur.r][cur.c]);
                }
            }

            int size = q.size();
            for (int i = 0; i < size; i++){
                Pos cur = q.poll();

                for (int d = 0; d < 4; d++){
                    int nr = cur.r + dr[d];
                    int nc = cur.c + dc[d];
                    int nv = cur.v + 1;

                    if (nr < 0 || nr >= N || nc < 0 || nc >= N || ground[nr][nc] < 0 || visit[nr][nc]) continue;

                    visit[nr][nc] = true;
                    ground[nr][nc] = nv;
                    q.offer(new Pos(nr, nc, 0, nv));
                }
            }

            printMap(ground);

        }
    }

    // ** 동 외에 다시 보기
    static int connectEscape(int d, int nr, int nc){
        if (d == 0){    // 동
            if (map[M-1][3*M+(M-1-(nr-wall.r))] != -1) {
                return map[M-1][3*M+(M-1-(nr-wall.r))] +1;
            }
        } else if (d == 1){ // 서
            if (map[M-1][M+(nr-wall.r)] != -1) {
                return map[M-1][M+(nr-wall.r)] +1;
            }
        } else if (d == 2){ // 남
            if (map[M-1][nc-wall.c+2*M] != -1) {
                return map[M-1][nc-wall.c+2*M] +1;
            }
        } else {    // 북
            if (map[M-1][M-1-(nc-wall.c)] != -1)
                return map[M-1][M-1-(nc-wall.c)]+1;
        }
        return -1;
    }

    static void findEscape(){
        for (int i = wall.r; i < wall.r+M; i++){
            for (int j = wall.c; j < wall.c+M; j++){
                if (i == wall.r || i == wall.r+M-1 || j == wall.c || j == wall.c+M-1){
                    for (int d = 0; d < 4; d++){
                        int nr = i + dr[d];
                        int nc = j + dc[d];

                        if (nr >= 0 && nr < N && nc >= 0 && nc < N && ground[nr][nc] == 0){
                            escape = new Pos(nr, nc, 0, 0);
//                            System.out.println("탈출구 좌표: "+nr+","+nc+" / 방향: "+d);
                            ground[nr][nc] = connectEscape(d, nr, nc);
                        }
                    }
                }
            }
        }
    }

    static void findWall(){
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if (ground[i][j] == -3){
                    wall = new Pos(i, j, 0, 0);
                    return;
                }
            }
        }
    }

    static void copyTw(int[][] from, int[][] to, int c){
        for (int i = 0; i < M; i++){
            for (int j = c; j < c+M; j++){
                to[i][j] = from[i][j-c];
            }
        }
    }

    static void bfsCenter(){
        boolean[][] visit = new boolean[M][M];
        Queue<Pos> q = new ArrayDeque<>();
        center[start.r][start.c] = 0;
        visit[start.r][start.c] = true;
        q.offer(new Pos(start.r, start.c, 0, 0));

        while (!q.isEmpty()){
            Pos cur = q.poll();

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];
                int nv = cur.v + 1;

                if (nr < 0 || nr >= M || nc < 0 || nc >= M) {   // 범위 밖일 경우
                    if (nr < 0){                // 북
                        if (north[0][M-1-nc] != -1) // 북쪽으로 봤을 때 빈칸인 경우
                            north[0][M-1-nc] = nv;
                    } else if (nr >= M){        // 남
                        if (south[0][nc] != -1) // 남쪽으로 봤을 때 빈칸인 경우
                            south[0][nc] = nv;
                    } else if (nc < 0){         // 서
                        if (west[0][nr] != -1)  // 서쪽으로 봤을 때 빈칸인 경우
                            west[0][nr] = nv;
                    } else {                    // 동
                        if (east[0][M-1-nr] != -1)  // 동쪽으로 봤을 때 빈칸인 경우
                            east[0][M-1-nr] = nv;
                    }
                    continue;
                }

                if (center[nr][nc] != 0 || visit[nr][nc]) continue;     // 빈칸이 아니거나 이미 방문한 경우

                center[nr][nc] = nv;
                visit[nr][nc] = true;
                q.offer(new Pos(nr, nc, 0, nv));
            }
        }
    }

    // 북 - 동 - 남 - 서 를 펼쳐놓은 배열
    static void bfsSide(){
        boolean[][] visit = new boolean[M][4*M];
        copyTw(north, map, 0);
        copyTw(west, map, M);
        copyTw(south, map, 2*M);
        copyTw(east, map, 3*M);

        PriorityQueue<Pos> q = new PriorityQueue<>((p1, p2) -> p1.v - p2.v);
        for (int i = 0; i < 4*M; i++){
            if (map[0][i] > 0) {
                visit[0][i] = true;
                q.offer(new Pos(0, i, 0, map[0][i]));
            }
        }

        while (!q.isEmpty()){
            Pos cur = q.poll();

            for (int d = 0; d < 4; d++) {
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];
                int nv = cur.v + 1;

                if (nr < 0 || nr >= M) continue;

                if (nc < 0 || nc >= 4*M) {   // 옆으로 범위 밖일 경우
                    if (nc < 0){
                        nc = 4*M-1;
                    } else {
                        nc = 0;
                    }
                }

                if (map[nr][nc] != 0 || visit[nr][nc]) continue;     // 빈칸이 아니거나 이미 방문한 경우

                map[nr][nc] = nv;
                visit[nr][nc] = true;
                q.offer(new Pos(nr, nc, 0, nv));
            }
        }

        printMap(map);
    }

    static void inputTw(int[][] map) throws Exception{
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < M; j++){
                int n = Integer.parseInt(st.nextToken());
                if (n == 2){
                    start = new Pos(i, j, 0, 0);
                }
                map[i][j] = n * -1;
            }
        }
    }

    // ============= print =============
    static void printPos(Pos pos, String str){
//        System.out.println(str+"("+pos.r+","+pos.c+")");
    }
    static void printMap(int[][] map){
//        for (int i = 0; i < map.length; i++){
//            for (int j = 0; j < map[0].length; j++){
//                System.out.printf("%2d ", map[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println("========================================");
    }
}
