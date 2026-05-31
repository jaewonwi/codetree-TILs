import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toCharArray();
        char c = sc.next().charAt(0);
        int cnt = 0;
        for (char s : str){
            if (c == s){ cnt++; }
        }
        System.out.println(cnt);
    }
}