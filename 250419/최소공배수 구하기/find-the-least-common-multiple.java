import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getLCM(n, m));
    }

    static int getLCM(int n, int m){
        int on = n, om = m;
        if (n < m){
            int t = n;
            n = m;
            m = t;
        }

        while (n % m != 0){
            int r = n % m;
            n = m;
            m = r;
        }

        // m이 최대 공약수. 최소공배수? a/gcd * b/gcd * gcd <==> a*b/gcd
        on /= m;
        om /= m;
        return on * om * m;
    }
}