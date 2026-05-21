import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        recursion(n);
    }

    public static void recursion(int N){
        if (N == 0){
            return;
        }

        System.out.print(N+" ");
        recursion(N-1);
        System.out.print(N+" ");
    }
}