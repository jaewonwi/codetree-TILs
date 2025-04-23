import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rec(n));
    }

    static int rec(int n){
        if (n == 1 || n == 2){
            return n;
        }

        return rec(n/3) + rec(n-1);
    }
}