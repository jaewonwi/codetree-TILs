import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println(func(a*b*c));
        
    }

    public static int func(int n){
        if (n == 0){
            return n;
        }
        return func(n/10) + n%10;
    }
}