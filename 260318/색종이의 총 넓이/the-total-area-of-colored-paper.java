import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[][] paper = new boolean[201][201];
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt() + 100;
            y[i] = sc.nextInt() + 100;

            for (int k = x[i]; k < x[i] + 8; k++){
                for (int j = y[i]; j < y[i] + 8; j++){
                    paper[k][j] = true;
                }   
            }
        }

        int ans = 0;
        for (int i = 0; i <= 200; i++){
            for (int j = 0; j <= 200; j++){
                if (paper[i][j]) ans++;
            }
        }
        
        System.out.print(ans);
    }
}