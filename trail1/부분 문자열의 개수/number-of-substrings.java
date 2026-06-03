import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine().trim();
        String B = sc.nextLine();

        int ans = 0;
        for (int i = 0; i < A.length()-2+1; i++){
            if (A.substring(i, i+2).equals(B)) ans++;
        }

        System.out.println(ans);
    }
}