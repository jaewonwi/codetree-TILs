import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int tot = 0;
        if (A % 2 != 0) A++;
        for (int i = A; i <= B; i += 2){
            tot += i;
        }
        System.out.println(tot);
    }
}