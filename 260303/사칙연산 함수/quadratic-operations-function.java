import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        int answer = Integer.MIN_VALUE;
        switch (o) {
            case '+':
                answer = plus(a,c);
                break;
            case '-':
                answer = minus(a,c);
                break;
            case '/':
                answer = divide(a,c);
                break;
            case '*':
                answer = mult(a,c);
                break;
            default:
                break;
        }
        if (answer == Integer.MIN_VALUE)
            System.out.print("False");
        else 
            System.out.printf("%d %c %d = %d", a, o, c, answer); 
    }

    static int plus(int a, int c){
        return a + c;
    }

    static int minus(int a, int c){
        return a - c;
    }
    static int divide(int a, int c){
        return a / c;
    }
    static int mult(int a, int c){
        return a * c;
    }

}