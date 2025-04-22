import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(summary(n));
    }

    static int summary(int n){
        if (n == 1)
            return 1;
        

        return summary(n-1) + n;
    }
}