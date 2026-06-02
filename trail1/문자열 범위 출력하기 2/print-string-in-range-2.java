import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        for (int i = str.length()-1; i >= Math.max(0, str.length()-n); i--){
            System.out.print(str.charAt(i));
        }
    }
}