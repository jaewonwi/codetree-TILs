import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int tc = 1; tc <= N; tc++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            if (a % 2 != 0) a++;
            int tot = 0;
            for (int i = a; i <= b; i += 2){
                tot += i;
            }
            
            System.out.println(tot);
        }
    }
}