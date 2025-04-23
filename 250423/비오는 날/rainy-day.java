import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Day[] days = new Day[n];
        for (int i = 0; i < n; i++) {
            String date = sc.next();
            String day = sc.next();
            String weather = sc.next();
            days[i] = new Day(date, day, weather);
        }

        LocalDate today = LocalDate.of(2000,1,1);
        Day ans = days[0];
        long minDiff = Long.MAX_VALUE;
        for (int i = 0; i < n; i++){
            Day cur = days[i];
            if (!cur.weather.equals("Rain")) continue;  // 비오는 날이 아니라면 패스

            long diff = Math.abs(ChronoUnit.DAYS.between(today, cur.date));     // 날짜 차이 구하기
            if (diff < minDiff){    // 차이가 최소라면
                minDiff = diff;
                ans = cur;
            }
        }

        System.out.println(ans.date+" "+ans.day+" "+ans.weather);
    }

    public static class Day{
        LocalDate date;
        String day, weather;

        public Day(String ymd, String day, String weather){
            this.date = LocalDate.parse(ymd);       // "yyyy-mm-dd" -> LocalDate 
            this.day = day;
            this.weather = weather;
        }
    }
}