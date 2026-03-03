import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int cnt = 0;
        boolean[] primeNumbers = new boolean[b+1];
        Arrays.fill(primeNumbers, true);
        primeNumbers[0] = false;
        primeNumbers[1] = false;
        prime(primeNumbers, b);

        for (int i = a; i <= b; i++){
            if (primeNumbers[i] && isEvenSum(i))
                cnt++;
        }
        System.out.print(cnt);
    }

    public static void prime(boolean[] nums, int n){
        for (int i = 2; i <= Math.sqrt(n); i++){
            for (int j = i * i; j <= n; j += i){
                nums[j] = false;
            }
        }
    }

    public static boolean isEvenSum(int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }

        return sum % 2 == 0 ? true : false;
    }
}