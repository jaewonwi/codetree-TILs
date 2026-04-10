import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++)
            arr[i] = sc.nextInt();
        
        int ans = 0;
        while (m != 1){
            ans += arr[m];
            m = calM(m);
        }
        
        ans += arr[1];
        System.out.println(ans);
    }

    public static int calM(int m){
        if (m % 2 == 0)
            return even(m);
        return odd(m);
    }

    public static int odd(int num){
        return num - 1;
    }

    public static int even(int num){
        return num / 2;
    }
}