import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int eeCnt = 0;
        int ebCnt = 0;
        for (int i = 0; i < str.length()-2+1; i++){
            String substr = str.substring(i, i+2);
            // System.out.println(substr);
            if (substr.equals("ee")) eeCnt++;
            else if (substr.equals("eb")) ebCnt++;
        }

        System.out.println(eeCnt+" "+ebCnt);
    }
}