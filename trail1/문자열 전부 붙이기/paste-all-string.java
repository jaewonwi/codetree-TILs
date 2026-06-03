import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        for (int i = 0; i < n; i++){
            String input = sc.next();
            ans += input;
        }

        System.out.println(ans);
    }
}