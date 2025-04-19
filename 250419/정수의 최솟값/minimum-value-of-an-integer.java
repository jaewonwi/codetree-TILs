import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(getMin(a,b,c));
    }

    static int getMin(int a, int b, int c){
        int min = 101;
        min = min > a ? a : min;
        min = min > b ? b : min;
        min = min > c ? c : min;
        return min;
    }
}