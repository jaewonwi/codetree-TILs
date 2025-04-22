import java.util.Scanner;
public class Main {
    public static String text = "", pattern = "";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        
        System.out.println(isContain());
    }

    public static int isContain(){
        int idx = text.indexOf(pattern);
        return idx;
    }
}