import java.util.*;
import java.io.*;

public class Main {

    static int n, m, order;
    static int[][] map, ans;
    static boolean[][] visit;
    static int[] dy = {1, 0};
    static int[] dx = {0, 1};
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        ans = new int[n][m];
        visit = new boolean[n][m];
        for (int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }    
        }

        visit[0][0] = true;
        order = 1;
        ans[0][0] = order;
        dfs(0, 0, order);

        System.out.println(ans[n-1][m-1] > 0 ? 1 : 0);
    }

    static void dfs(int y, int x, int o){
        for (int d = 0; d < 2; d++){
            int ny = y + dy[d];
            int nx = x + dx[d];

            if (canGo(ny, nx)){
                visit[ny][nx] = true;
                ans[ny][nx] = o+1;
                dfs(ny, nx, o+1);    
            }
        }
    }

    static boolean inRange(int y, int x){
        if (y >= 0 && y < n && x >= 0 && x < m) return true;
        return false;
    }

    static boolean canGo(int y, int x){
        if (!inRange(y, x)) return false;
        if (visit[y][x] || map[y][x] == 0) return false;
        return true;
    }
}