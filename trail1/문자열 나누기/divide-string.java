import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();

        String[] arr = input.split(" ");
        String str = String.join("", arr);
        
        int index = 0;
        while (index < str.length()){
            System.out.println(str.substring(index, Math.min(index+5, str.length())));
            index += 5;
        }
    }
}