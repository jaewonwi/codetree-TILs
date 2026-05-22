import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(func(n));
    }

    public static int func(int N){
        if (N == 1){
            return 0;
        }

        return (N%2==0) ? func(N/2) + 1 : func(N*3+1) + 1;
    }
}