import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];
        int ans = 0;
        boolean[][] space = new boolean[201][201];
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt()+100;
            y1[i] = sc.nextInt()+100;
            x2[i] = sc.nextInt()+100;
            y2[i] = sc.nextInt()+100;
            for (int k = x1[i]; k < x2[i]; k++){
                for (int j = y1[i]; j < y2[i]; j++){
                    space[k][j] = true;
                }
            }
        }
        // ans += Math.abs(x1[i]-x2[i]) *  Math.abs(y1[i]-y2[i]);
        for (int i = 0; i < 201; i++){
            for (int j = 0; j < 201; j++){
                if (space[i][j]) ans++;
            }
        }

        System.out.println(ans);
    }
}