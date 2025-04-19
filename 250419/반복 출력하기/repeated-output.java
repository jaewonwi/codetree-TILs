import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNLines(n);
    }
    
    static void printNLines(int N){
        for (int i = 0; i < N; i++){
            System.out.println("12345^&*()_");
        }
    }
}