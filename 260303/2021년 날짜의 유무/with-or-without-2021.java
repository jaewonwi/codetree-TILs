import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.println(isExist(m, d) ? "Yes" : "No");
    }

    static boolean isExist(int m, int d){
        if (m > 12) return false;
        if (d > 31) return false;

        if (m == 2)
            return d <= 28 ? true : false;
        else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
            return d <= 31 ? true : false;
        else
            return d <= 30 ? true : false;
    }
}