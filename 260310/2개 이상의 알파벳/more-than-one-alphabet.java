import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(judge(A) ? "Yes" : "No");
    }

    public static boolean judge(String A){
        char[] chars = A.toCharArray();
        boolean[] alphavet = new boolean[26];
        
        for (int i = 0; i < chars.length; i++){
            alphavet[chars[i] - 'a'] = true;
        }
        
        int cnt = 0;
        for (int i = 0; i < 26; i++){
            if (alphavet[i]) cnt++;
        }
        return cnt > 1 ? true : false;
    }
}