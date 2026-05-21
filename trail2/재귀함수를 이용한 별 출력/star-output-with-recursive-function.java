import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        star(n);
    }

    public static void star(int n){
        if (n == 1){
            System.out.println("*");
            return;
        }
        
        star(n-1);

        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}