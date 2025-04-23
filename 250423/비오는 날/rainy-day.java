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

        LocalDate today = LocalDate.now();
        Day ans = days[0];
        long minDiff = Long.MAX_VALUE;
        for (int i = 0; i < n; i++){
            Day cur = days[i];
            if (!cur.weather.equals("Rain")) continue;

            long diff = Math.abs(ChronoUnit.DAYS.between(today, cur.date));
            if (diff < minDiff){
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