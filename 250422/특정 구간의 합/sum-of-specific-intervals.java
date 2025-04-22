import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // ========= 입력 =========
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // ========= 구간합 =========
        int[] sArr = new int[n+1];
        for (int i = 1; i <= n; i++){
            sArr[i] = sArr[i-1] + arr[i-1];
        }

        // (a1, a2) 구간합 구하기
        for (int i = 0; i < m; i++) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            System.out.println(sArr[a2] - sArr[a1-1]);
        }
    }
}