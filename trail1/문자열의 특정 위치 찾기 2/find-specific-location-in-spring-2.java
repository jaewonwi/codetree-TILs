import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] sArr = {"apple", "banana", "grape", "blueberry", "orange"};

        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int ans = 0;
        for (String str : sArr){
            if (str.charAt(2) == c || str.charAt(3) == c){
                System.out.println(str);
                ans++;
            }
        }
        System.out.println(ans);
    }
}