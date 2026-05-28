import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        int[][] map = new int[N][N];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                map[i][j] = sc.nextInt();
            }
        }

        int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                int cnt = 0;
                for (int d = 0; d < 4; d++){
                    int ny = i + dy[d];
                    int nx = j + dx[d];

                    if (!inRange(ny, nx, N) || map[ny][nx] == 0) continue;

                    cnt++;
                }
                if (cnt >= 3) answer++;
            }
        }

        System.out.println(answer);

    }

    public static boolean inRange(int y, int x, int N){
        if (y < 0 || y >= N || x < 0 || x >= N) return false;
        return true;
    }
}