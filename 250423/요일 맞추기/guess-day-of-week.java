import java.util.Scanner;

public class Main {
    static int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    static String[] week = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int day1 = getDays(m1, d1);
        int day2 = getDays(m2, d2);
        
        int rem1 = day1 % 7;
        int rem2 = day2 % 7;
        int diff = (rem2 - rem1 + 7) % 7;
        System.out.println(week[diff]);
    }

    static int getDays(int m, int d){
        int sum = d;
        for (int i = 1; i < m; i++){
            sum += days[i];
        }
        return sum;
    }
}