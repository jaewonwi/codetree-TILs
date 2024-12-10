import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float result = (float)(a+b)/(a-b);
        System.out.println(Math.round(result*100)/100.0);    
    }
}