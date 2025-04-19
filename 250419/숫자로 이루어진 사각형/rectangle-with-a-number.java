import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printRect(n);
    }

    static void printRect(int N){
        int cnt = 0;
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                System.out.print( (cnt % 9 + 1) +" ");
                cnt++;
            }
            System.out.println();
        }

    }
}