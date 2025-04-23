import java.util.Scanner;
public class Main {
    static int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        int day1 = getDays(m1) + d1;
        int day2 = getDays(m2) + d2;
        System.out.println(day2-day1+1);
    }

    static int getDays(int month){
        int sum = 0;
        for (int i = 1; i < month; i++){
            sum += days[i];
        }
        return sum;
    }
}