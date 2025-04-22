import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        printRecur1(n);
        System.out.println();
        printRecur2(n);
    }

    static void printRecur1(int n){
        if (n == 0)
            return;

        printRecur1(n-1);
        System.out.print(n+" ");
    }

    static void printRecur2(int n){
        if (n == 0)
            return;

        System.out.print(n+" ");
        printRecur2(n-1);
    }
}