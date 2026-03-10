import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        
        if (a.n > b.n){
            calculate(b, a);
        } else {
            calculate(a, b);
        }
        System.out.println(a.n+" "+b.n);
    }

    public static class IntWrapper{
        int n;
        public IntWrapper(int i){
            this.n = i;
        }
    }

    public static void calculate(IntWrapper small, IntWrapper big){
        big.n += 25;
        small.n *= 2;
    }
}