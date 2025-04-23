import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int origin = 60*11 + 11;
        int target = 60*24*(A-11) + 60*B + C;

        System.out.println(target < origin ? -1 : target - origin);
    }
}