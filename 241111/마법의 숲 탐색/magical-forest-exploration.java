import java.util.*;
import java.io.*;

public class Main{
    /* 시뮬레이션
    1. 중심을 R=-1에 두고 골렘 출발
    2. 최대한 아래로 이동
        1. 남쪽 → 서쪽 → 동쪽 순서로 이동가능한지 확인 후 이동
        2. 출구 방향 고려해주기
    3. 골렘 몸이 밖에 삐져나왔는지 확인
    4. 아니라면 정령 최대한 아래쪽으로 이동 후 합 누적
        1. 타고있는 골렘에서 갈 수 있는 골렘이 있다면 타고 가서 최대한 남쪽으로 이동시키기

    ** 골렘 class{ 중심 위치 r c, 탈출구 방향 ed } */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static int R, C, K, max = 0, ans = 0;
    static int[][] map;
    static int[] dr = {-1, 0, 1, 0}, dc = {0, 1, 0, -1};    // 북 동 남 서
    static int cr, cc, cd, idx;    // 현재 중심 좌표, 현재 출구 방향, 현재 보고있는 골렘 인덱스
    static boolean[][] visit, gate;
    static class Node {
        int r, c, dir;  // dir : 탈출구 방향,
        public Node(int r, int c, int dir){
            this.r = r;
            this.c = c;
            this.dir = dir;
        }
    }

    public static void main(String[] args) throws Exception{
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        map = new int[R+1][C+1];    // 0 dummy
        gate = new boolean[R+1][C+1];
        visit = new boolean[R+1][C+1];    // 0 dummy
        for (int i = 0; i < K; i++){
            idx = i+1;
            cr = 0;
            st = new StringTokenizer(br.readLine());
            int cc = Integer.parseInt(st.nextToken());
            int cd = Integer.parseInt(st.nextToken());

            if (go(new Node(cr, cc, cd))){
                ans += goFairy();    // 숲에 잘 안착했으면 정령 내려가게 해서 행 누적
            } else {
                for (int r = 0; r <= R; r++){
                    Arrays.fill(map[r], 0);
                    Arrays.fill(gate[r], false);
                }
            };
        }

        System.out.println(ans);
    }

    // 정령이 최대한 아래로 내려간다.
    static int goFairy(){
        gate[cr + dr[cd]][cc + dc[cd]] = true;

        max = cr;

        Queue<Node> q = new LinkedList<>();
        for (int i = 0; i <= R; i++){
            Arrays.fill(visit[i], false);
        }
        q.offer(new Node(cr, cc, idx));
        visit[cr][cc] = true;

        while (!q.isEmpty()){
            Node cur = q.poll();
            max = Math.max(max, cur.r);

            for (int d = 0; d < 4; d++){
                int nr = cur.r + dr[d];
                int nc = cur.c + dc[d];

                if (!inRange(nr,nc) || map[nr][nc] == 0 || visit[nr][nc]) continue;

                if (map[nr][nc] == cur.dir){
                    visit[nr][nc] = true;
                    q.offer(new Node(nr, nc, cur.dir));
                } else {
                    if (gate[cur.r][cur.c]){
                        visit[nr][nc] = true;
                        q.offer(new Node(nr, nc, map[nr][nc]));
                    }
                }

            }
        }

        return max;
    }


    static boolean go(Node cur){    // 남 -> 서 -> 동 순서로 갈 방향으로 가자
        cr = cur.r;
        cc = cur.c;
        cd = cur.dir;
        boolean flag = true;
        while (flag){
            if (canGo(cr+1, cc)) {    // south
                spin(0);
            } else if (canGo(cr, cc-1) && canGo(cr+1, cc-1)){   // west
                spin(-1);
            } else if (canGo(cr, cc+1) && canGo(cr+1, cc+1)){   // east
                spin(1);
            } else {
                flag = false;
            }
        }

        if (!inForest(cr, cc)) {
            return false;
        }
        return true;
    }

    static void spin(int dir){
        fill(0);    // 원래 있던 자리 비워주고    // 0: 빈칸
        cc += dir;
        map[++cr][cc] = idx;      // 정령 & 중심 이동
        fill(idx);    // 이동 후 자리 채워주기

        cd = (cd + 4 + dir) % 4;
    }

    static void fill(int flag){
        map[cr][cc] = flag;
        for (int d = 0; d < 4; d++){
            if (!inRange(cr+dr[d], cc+dc[d])) continue; // 이미 갈 수 있는지 체크 끝났으니까 범위 밖은 그냥 스킵! (출발점 때문에)
            map[cr+dr[d]][cc+dc[d]] = flag;
        }
    }

    static boolean inForest(int r, int c){  // 숲을 벗어나있다면
        for (int d = 0; d < 4; d++){
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (nr < 1 || nr > R || nc < 1 || nc > C) return false;
        }
        return true;
    }

    static boolean canGo(int r, int c){     // r, c가 중심이 되게 이동할 수 있는지
        for (int d = 0; d < 4; d++){
            if (r == 0 && d == 0) continue;

            int nr = r + dr[d];
            int nc = c + dc[d];

            if (!inRange(nr, nc)) return false;     // 범위 밖이라면
            if (map[nr][nc] > 0 && map[nr][nc] != idx) return false;    // 이미 내가 아닌 골렘이 있다면
        }
        return true;
    }

    static boolean inRange(int r, int c){   // 범위 안 인지
        if (r >= 0 && r <= R && c >= 1 && c <= C) return true;
        return false;
    }
}