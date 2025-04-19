import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newStr = str.charAt(0) + "a" + str.substring(2, str.length() - 2) + "a" + str.charAt(str.length()-1);
        System.out.println(newStr);
    }
}