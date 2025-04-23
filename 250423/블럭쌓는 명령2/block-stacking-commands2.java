import java.util.Scanner;
public class Main {
    static int[] blocks;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        blocks = new int[N];
        for (int i = 0; i < K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            stack(A,B);
        }
        
        int max = 0;
        for (int i = 0; i < N; i++){
            max = Math.max(blocks[i], max);
        }
        System.out.println(max);
    }

    static void stack(int from, int to){
        for (int i = from-1; i <= to-1; i++){
            blocks[i]++;
        }
    }

}