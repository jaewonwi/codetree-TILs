import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int lcm = arr[0];
        for (int i = 1; i < n; i++){    // 처음부터 보면서 현재까지의 최소공배수를 갱신해나간다.
            int next = arr[i];
            lcm = lcm * next / gcd(lcm, next);    // 최소공배수 = a*b/gcd
        }

        System.out.println(lcm);
    }

    static int gcd(int a, int b){      // 최대공약수 구하는 재귀함수
        return (a%b) > 0 ? gcd(b, a%b) : b;
    }
}