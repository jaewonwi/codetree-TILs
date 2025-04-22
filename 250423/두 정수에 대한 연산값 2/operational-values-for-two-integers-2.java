import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntWrapper a = new IntWrapper(sc.nextInt());
        IntWrapper b = new IntWrapper(sc.nextInt());
        cal(a, b);
        System.out.println(a.val+" "+b.val);
    }

    static void cal(IntWrapper a, IntWrapper b){
        if (a.val > b.val){
            a.val *= 2;
            b.val += 10;
        } else {
            a.val += 10;
            b.val *= 2;
        }
    }

}

class IntWrapper{
    int val;

    public IntWrapper(int val){
        this.val = val;
    }
}