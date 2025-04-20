import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 0;
        for (int i = A; i <= B; i++){
            if (is369(i))
                cnt++;
        }
        System.out.println(cnt);
    }

    static boolean is369(int n){
        if (n%3==0 || isExist369(n))
            return true;
        return false;
    }

    static boolean isExist369(int n){
        while (n >= 10){
            int div = n / 10;
            if (div == 3 || div == 6 || div == 9) return true;
            n %= 10;
        }

        if (n < 10){
            if (n == 3 || n == 6 || n == 9) return true;
        }

        return false;
    }
}