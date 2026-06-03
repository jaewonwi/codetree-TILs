import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        int cnt = 0;
        char prev = ' ';
        
        while (idx < str.length()){
            char cur = str.charAt(idx++);

            if (prev == ' '){   // 첫번째 문자일 경우
                sb.append(cur);
                prev = cur;
                cnt++;
                continue;
            }
            
            if (prev == cur){
                cnt++;
            } else {
                // System.out.print(cnt);
                sb.append(cnt);
                sb.append(cur);
                cnt = 1;
                prev = cur;
            }
        }
        sb.append(cnt);

        System.out.println(sb.toString().length());
        System.out.println(sb.toString());
    }
}