import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        int n = 0;
        for (int i = 0; i < binary.length(); i++){
            n = n * 2 + (binary.charAt(i)-'0');
        }
        n *= 17;
        
        int[] digits = new int[30];
        int cnt = 0;
        while (true){
            if (n < 2){
                digits[cnt] = n;
                break;
            }

            digits[cnt++] = n % 2;
            n /= 2;
        }

        for (int i = cnt; i >= 0; i--){
            System.out.print(digits[i]);
        }
    }
}