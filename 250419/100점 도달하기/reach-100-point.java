import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int N = n; N <= 100; N++){
            if (N >= 90){
                System.out.print("A ");
            } else if (N >= 80){
                System.out.print("B ");
            } else if (N >= 70){
                System.out.print("C ");
            } else if (N >= 60){
                System.out.print("D ");
            } else {
                System.out.print("F ");
            }
        }
    }
}