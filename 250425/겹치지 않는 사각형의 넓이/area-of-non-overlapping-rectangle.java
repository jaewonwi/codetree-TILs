import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int offset = 1000;
        int ax1 = sc.nextInt() + offset;
        int ay1 = sc.nextInt() + offset;
        int ax2 = sc.nextInt() + offset;
        int ay2 = sc.nextInt() + offset;

        int bx1 = sc.nextInt() + offset;
        int by1 = sc.nextInt() + offset;
        int bx2 = sc.nextInt() + offset;
        int by2 = sc.nextInt() + offset;
        
        int mx1 = sc.nextInt() + offset;
        int my1 = sc.nextInt() + offset;
        int mx2 = sc.nextInt() + offset;
        int my2 = sc.nextInt() + offset;
        
        boolean[][] map = new boolean[2001][2001];
        int ans = 0;
        for (int i = ax1; i < ax2; i++){
            for (int j = ay1; j < ay2; j++){
                map[i][j] = true;
                ans++;
            }
        }
        for (int i = bx1; i < bx2; i++){
            for (int j = by1; j < by2; j++){
                map[i][j] = true;
                ans++;
            }
        }
        for (int i = mx1; i < mx2; i++){
            for (int j = my1; j < my2; j++){
                if (map[i][j]){
                    ans--;
                }
                map[i][j] = false;
            }
        }
        
        System.out.println(ans);
    }
}