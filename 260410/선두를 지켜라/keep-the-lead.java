import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] posA = new int[1001];
        int[] posB = new int[1001];
        
        int idx = 0;
        int max = 0;
        for (int i = 0; i < n; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            int time = 0;
            while (time < t){
                posA[idx+1] = posA[idx]+v;
                idx++;
                time++;
            }
            max += t;
        }
        
        idx = 0;
        for (int i = 0; i < m; i++){
            int v = sc.nextInt();
            int t = sc.nextInt();

            int time = 0;
            while (time < t){
                posB[idx+1] = posB[idx]+v;
                idx++;
                time++;
            }
        }


        int cnt = 0;
        int first = -1;
        for (int i = 1; i <= max; i++){
            if (posA[i] == posB[i]) continue;
            int faster = posA[i] > posB[i] ? 0 : 1;
            if (first == -1){
                first = faster;
            } else if (first != faster){
                cnt++;
                first = faster;
            }
        }

        System.out.println(cnt);
    }
}