import java.util.Scanner;
public class Main {
    public static int olen, plen;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        olen = text.length();
        plen = pattern.length();
        System.out.println(isContain(text, pattern));
    }

    public static int isContain(String origin, String pattern){
        int idx = 0;
        int cnt = 0;
        while (idx < olen){
            if (origin.charAt(idx) == pattern.charAt(cnt)){     // 만약 같다면
                if (cnt == plen - 1)         // 심지어 마지막이라면
                    return idx - plen + 1;

                cnt++;
            } else {        // 초기화
                cnt = 0;
            }
            idx++;
        }
        return -1;
    }
}