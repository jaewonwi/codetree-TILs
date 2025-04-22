import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStar1(n);
        printStar2(n);
    }

    static void printStar1(int n){
        if (n == 0)
            return;

        for (int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
        printStar1(n-1);
    }

    static void printStar2(int n){
        if (n == 0)
            return;

        printStar2(n-1);
        for (int i = 0; i < n; i++){
            System.out.print("* ");
        }
        System.out.println();
    }
}