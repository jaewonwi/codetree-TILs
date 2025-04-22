import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (isPalindrome(input))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    static boolean isPalindrome(String A){
        int start = 0;
        int end = A.length() - 1;

        while (start < end){
            if (A.charAt(start) == A.charAt(end)){
                start++;
                end--;
            } else
                return false;
        }
        return true;
    }
}