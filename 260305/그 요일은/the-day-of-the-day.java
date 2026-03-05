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

        int cnt = 0;
        diff -= week;   // 월요일부터 -> 찾아야하는 요일까지 차이를 줄여주고,
        if (diff > 0) cnt++;          // 찾았다면 1번 등장했으니까 카운트
        else {          // 못 찾았다면 없으니까 바로 return;
            System.out.println(cnt);    
            return;
        }

        cnt += diff / 7;            // 남은 차이를 일주일로 나눠서 A 요일이 몇 번 등장하는지 카운트
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