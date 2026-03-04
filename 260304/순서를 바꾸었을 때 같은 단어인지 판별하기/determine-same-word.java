import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars1 = sc.next().toCharArray();
        char[] chars2 = sc.next().toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if (chars1.length != chars2.length){
            System.out.print("No");
            return;
        }

        for (int i = 0; i < chars1.length; i++){
            if (chars1[i] != chars2[i]){
                System.out.print("No");
                return;
            }
        }
        System.out.print("Yes");
    }
}