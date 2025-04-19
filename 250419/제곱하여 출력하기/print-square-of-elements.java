import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] ori = new int[N];
        int[] ans = new int[N];
        for (int i = 0; i < N; i++){
            ori[i] = sc.nextInt();
            ans[i] = (int) Math.pow(ori[i],2);
            System.out.print(ans[i]+" ");
        }
    }
}