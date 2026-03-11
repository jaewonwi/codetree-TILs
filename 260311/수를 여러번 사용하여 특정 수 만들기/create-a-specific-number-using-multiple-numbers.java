import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        
        int a = C / A;
        int b = C / B;
        int ans = 0;
        for (int i = 0; i <= a; i++){
            for (int j = 0; j <= b; j++){
                int result = A * i + B * j;
                if (result <= C)
                    ans = Math.max(ans, result);
            }
        }

        System.out.println(ans);
    }
}