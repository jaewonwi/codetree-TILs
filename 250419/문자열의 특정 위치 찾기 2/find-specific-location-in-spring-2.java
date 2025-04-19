import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tot = 0;
        String[] strArr = {"apple","banana","grape","blueberry","orange"};
        char c = sc.next().charAt(0);

        for (int i = 0; i < 5; i++){
            String str = strArr[i];
            if (str.charAt(2) == c || str.charAt(3) == c){
                System.out.println(str);
                tot ++;
            }
        }
        
        System.out.println(tot);
    }
}