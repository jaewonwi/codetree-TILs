import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt(), H = sc.nextInt();
        W += 8;
        H *= 3;
        System.out.println(W);
        System.out.println(H);
        System.out.println(W*H);
    }
}