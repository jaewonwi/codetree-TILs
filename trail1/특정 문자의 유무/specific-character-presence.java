import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println((str.contains("ee") ? "Yes " : "No ") + (str.contains("ab") ? "Yes" : "No"));
    }
}