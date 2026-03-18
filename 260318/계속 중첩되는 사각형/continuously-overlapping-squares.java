import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[201][201];
        int flag = 1;    // 1: red, -1: blue
        int offset = 100;
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for (int j = x1; j < x2; j++){
                for (int k = y1; k < y2; k++){
                    map[j][k] = flag;
                }
            }
            
            flag *= -1;
        }

        int ans = 0;
        for (int i = 0; i < 201; i++){
            for (int j = 0; j < 201; j++){
                if (map[i][j] == -1) ans++;
            }
        }

        System.out.print(ans);
    }
}