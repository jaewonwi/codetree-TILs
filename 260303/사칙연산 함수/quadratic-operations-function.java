import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        
        switch (o) {
            case '+':
                System.out.printf("%d %c %d = %d", a, o, c, a + c);
                break;
            case '-':
                System.out.printf("%d %c %d = %d", a, o, c, a - c); 
                break;
            case '/':
                System.out.printf("%d %c %d = %d", a, o, c, a / c); 
                break;
            case '*':
                System.out.printf("%d %c %d = %d", a, o, c, a * c); 
                break;
            default:
                System.out.printf("False");
        }
    }
}