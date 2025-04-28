import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((int) solution(a,b));
    }

    static double solution(int a, int b){
        return Math.pow((double) a, (double) b);
    }
}