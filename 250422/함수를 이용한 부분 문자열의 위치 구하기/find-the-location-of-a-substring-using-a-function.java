import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();
        System.out.println(isContain(text, pattern));
    }

    public static int isContain(String origin, String pattern){
        int originIdx = 0;
        int patternIdx = 0;
        while (originIdx < origin.length()){
            if (origin.charAt(originIdx) == pattern.charAt(patternIdx)){
                if (patternIdx == (pattern.length()-1))
                    return originIdx - (pattern.length()-1);

                patternIdx++;
            } else {
                patternIdx = 0;
            }
            originIdx++;    
        }
        return -1;
    }
}