import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recur(n));
    }

    static int recur(int n){
        if (n < 10){
            return n * n;
        }

        return recur(n / 10) + (n%10)*(n%10);
    }
}