import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(getMaxComDiv(n,m));
    }

    static int getMaxComDiv(int n, int m){
        int ans = 0;
        int min = n >= m ? m : n;
        for (int i = 1; i < min; i++){
            if (n % i == 0 && m % i == 0) ans = i;
        }
        return ans;
    }
}