import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getGCD(n,m));
    }

    // 최대공약수(GCD), 최소공배수(LCM) 구하기 -> 유클리드 호제법!
    // a > b, a % b = r 라고 할 때,
    // "a와 b의 GCD == b와 r의 GCD"를 이용하여 계속해서 나머지를 구함. -> 나머지가 0일때 나누는 수가 GCD !
    static int getGCD(int n, int m){
        if (n < m) {
            int temp = n;
            n = m;
            m = temp;
        }
        
        while (n % m != 0){
            int r = n % m;
            n = m;
            m = r;
        }
        
        return m;
    }
}