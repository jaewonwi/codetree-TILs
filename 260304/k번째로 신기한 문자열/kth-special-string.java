import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        Arrays.sort(words);
        
        // for (int i = 0; i < n; i++) {
        //     System.out.println(words[i]);
        // }

        int idx = 0;
        for (int i = 0; i < n; i++){
            if (words[i].length() < t.length()) continue;

            if (isStartT(words[i], t)) {
                idx++;
                if (idx == k){
                    System.out.println(words[i]);
                    return;
                }
            }
        }
    }

    static boolean isStartT(String word, String t){
        boolean flag = true;
        for (int i = 0; i < t.length(); i++){
            if (word.charAt(i) != t.charAt(i)){
                flag = false;
            }
        }
        return flag;
    }
}