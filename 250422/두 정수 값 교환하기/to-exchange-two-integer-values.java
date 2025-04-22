import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        IntWrapper a = new IntWrapper(n);
        IntWrapper b = new IntWrapper(m);
        swap(a, b);
        System.out.println(a.val+" "+b.val);
    }

    static void swap(IntWrapper a, IntWrapper b){
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }   
}

class IntWrapper{
    int val;
    public IntWrapper(int n){
        this.val = n;
    }
}