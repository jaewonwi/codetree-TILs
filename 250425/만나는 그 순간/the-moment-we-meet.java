import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[1000_001];
        int[] brr = new int[1000_001];
        int curT = 0;
        int curP = 0;
        for (int i = 0; i < n; i++){
            int d = sc.next().charAt(0) == 'R' ? 1 : -1;
            int t = sc.nextInt();

            for (int j = 1; j <= t; j++){
                curP += d;
                arr[++curT] = curP;
            }
        }
        int lastT = curT;
        curT = 0;
        curP = 0;
        for (int i = 0; i < m; i++){
            int d = sc.next().charAt(0) == 'R' ? 1 : -1;
            int t = sc.nextInt();

            for (int j = 1; j <= t; j++){
                curP += d;
                brr[++curT] = curP;
            }
        }

        int ans = -1;
        for (int i = 1; i <= lastT; i++){
            if (arr[i] == brr[i]){
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}