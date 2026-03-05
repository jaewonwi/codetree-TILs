import java.util.Scanner;

public class Main {
    static int[] numOfDays = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] weeks = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        
        int day1 = getDays(m1, d1);
        int day2 = getDays(m2, d2);
        
        int diff = day2 - day1;
        int week = 0;
        for (int i = 0; i < 7; i++){
            if (weeks[i].equals(A))
                week = i;
        }

        int cnt = (diff - week) / 7;
        if (((diff - week) % 7)==0) cnt++;
        System.out.println(cnt);
    }

    static int getDays(int m, int d){
        int days = d;
        for (int i = 1; i < m; i++){
            days += numOfDays[i];
        }
        return days;
    }
}