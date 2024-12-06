import java.io.*;
import java.util.*;

public class Main {
    static int M, T, pr, pc, max;
    static int[][] map, deathmap, path, maxPath;
    static boolean[][] visit;
    static List<Monster> monsters = new ArrayList<>();
    static Queue<Monster> eggs = new ArrayDeque<>();
    static int[] dr = {-1,-1,0,1,1,1,0,-1}, dc = {0,-1,-1,-1,0,1,1,1};

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        pr = Integer.parseInt(st.nextToken())-1;
        pc = Integer.parseInt(st.nextToken())-1;

        map = new int[4][4];
        deathmap = new int[4][4];
        for (int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken())-1;
            int c = Integer.parseInt(st.nextToken())-1;
            int d = Integer.parseInt(st.nextToken())-1;

            monsters.add(new Monster(r,c,d));
            map[r][c]++;
        }

        path = new int[3][2];
        maxPath = new int[3][2];
        for (int t = 1; t <= T; t++){
            // 1. 몬스터 복제
            // 2. 몬스터 이동
            for (Monster monster : monsters){
                if (monster.rem > 0) continue;
                eggs.add(new Monster(monster.r, monster.c, monster.d));     // 1
                move(monster);  // 2
            }

            // 3. 팩맨 이동
            visit = new boolean[4][4];
//            visit[pr][pc] = true;     // ** 출발지 포함 안하는데, 다시 돌아오고싶으면 와도 되는거 아닌가?
            max = 0;
            find(pr, pc, 0, 0);
            for (int i = 0; i < 3; i++){
                int r = maxPath[i][0];
                int c = maxPath[i][1];

                for (Monster monster : monsters){
                    if (monster.r == r && monster.c == c && monster.rem == -1){ // 팩맨이 간 자리에 살아있는 몬스터들
                        monster.rem = 2;
                        deathmap[monster.r][monster.c]--;
                        map[monster.r][monster.c]--;
                    }
                }

                if (i == 2){
                    pr = r;
                    pc = c;
                }
            }

            // 4. 시체 소멸
            for (int i = monsters.size()-1; i >= 0; i-- ){
                Monster monster = monsters.get(i);
                if (monster.rem > 0){   // 시체라면
                    monster.rem--;
                    if (monster.rem == 0){
                        deathmap[monster.r][monster.c]++;
                        monsters.remove(i);
                    }
                }
            }

            // 5. 몬스터 알 부화
            while (!eggs.isEmpty()){
                Monster egg = eggs.poll();
                monsters.add(new Monster(egg.r, egg.c, egg.d));
                map[egg.r][egg.c]++;
            }
        }

        int ans = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (map[i][j] > 0) ans += map[i][j];
            }
        }

        System.out.println(ans);

    }
    static void find(int r, int c, int cnt, int turn){
        if (turn == 3){
            if (cnt > max){
                max = cnt;
                for (int i = 0; i < 3; i++){
                    maxPath[i][0] = path[i][0];
                    maxPath[i][1] = path[i][1];
                }
            }
            return;
        }

        for (int d = 0; d < 8; d += 2){ // 상좌하우
            int nr = r + dr[d];
            int nc = c + dc[d];

            if (!inRange(nr, nc) || visit[nr][nc]) continue;

            visit[nr][nc] = true;
            path[turn][0] = nr;
            path[turn][1] = nc;
            find(nr, nc, map[nr][nc] > 0 ? cnt + map[nr][nc] : cnt, turn+1);
            visit[nr][nc] = false;
        }
    }

    static void move(Monster m){
        for (int i = 0; i < 8; i++){
            int nr = m.r + dr[(m.d+i) % 8];
            int nc = m.c + dc[(m.d+i) % 8];

            if (nr == pr && nc == pc) continue; // 팩맨
            if (!inRange(nr, nc)) continue;     // 격자 밖
            if (deathmap[nr][nc] < 0) continue;      // 몬스터 시체

            map[m.r][m.c]--;
            map[nr][nc]++;
            m.r = nr;
            m.c = nc;
            m.d = (m.d+i) % 8;
            break;
        }
    }

    static boolean inRange(int r, int c){
        if (r >= 0 && r < 4 && c >= 0 && c < 4) return true;
        return false;
    }

    static class Monster{
        int r, c, d, rem = -1;
        public Monster(int r, int c, int d){
            this.r = r;
            this.c = c;
            this.d = d;
        }
    }

    static void printMap(int[][] map){
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}