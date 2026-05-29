import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();

        int ans = 0;
        for (int i = 0; i < len - 1; i++){
            for (int j = i+1; j < len; j++){
                if (str.charAt(i) == '(' && str.charAt(j) == ')') ans++;
            }
        }
        
        System.out.println(ans);
    }
}