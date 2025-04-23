import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

    public static int sum(int n){
        if (n == 1 || n == 2)
            return n;

        if (n % 2 == 0){
            return n + sum(n-2);
        } else {
            return n + sum(n-2);
        }
    }
}