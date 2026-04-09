import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] input = new int[n+1];
        boolean flag = false;
        for (int i = 0; i < m; i++) {
            int p = sc.nextInt();
            input[p]++;
            if (input[p] >= k){
                System.out.println(p);
                flag = true;
                break;
            }
        }
        if (flag == false)
            System.out.println(-1);
    }
}