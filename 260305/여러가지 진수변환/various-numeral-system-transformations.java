import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        
        int cnt = 0;
        int[] binary = new int[32];
        while (n > 0){
            binary[cnt++] = n % b;
            n /= b;
        }

        for (int i = cnt-1; i >= 0; i--){
            System.out.print(binary[i]);
        }
    }
}