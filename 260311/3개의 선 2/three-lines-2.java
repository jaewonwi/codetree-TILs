import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        
        // x or y에 평행하다? 
        int ans = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                int xVal = x[i];
                int yVal = y[j];

                Set<Integer> set = new HashSet<>();
                int[] remX = new int[11];
                int[] remY = new int[11];
                for (int k = 0; k < n; k++){
                    if (x[k] == xVal || y[k] == yVal){
                        set.add(k);
                    } else {
                        remX[x[k]]++;
                        remY[y[k]]++;
                    }
                }

                int remCnt = 0;
                for (int k = 0; k < 11; k++){
                    if (remX[k] > 0 && remCnt < remX[k]){
                        remCnt = remX[k];
                    }
                    if (remY[k] > 0 && remCnt < remY[k]){
                        remCnt = remY[k];
                    }
                }

                if (set.size() + remCnt == n){
                    ans = 1;
                    break;
                }
            }
            if (ans == 1) break;
        }

        System.out.println(ans);
    }
}