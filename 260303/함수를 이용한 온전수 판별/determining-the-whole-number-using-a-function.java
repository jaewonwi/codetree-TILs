import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int answer = 0;
        for (int i = A; i <= B; i++){
            if (completeNumber(i))
                answer ++;
        }
        System.out.println(answer);
    }

    static boolean completeNumber(int n){
        if (n % 2 == 0)
            return false;
        if (n % 10 == 5)
            return false;
        if (n % 3 == 0 && n % 9 != 0)
            return false;
        
        return true;
    }
}