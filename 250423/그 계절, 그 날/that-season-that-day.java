import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();

        System.out.println(season(y,m,d));       
    }

    static String season(int year, int month, int day){
        if (!isExist(year, month, day))
            return "-1";
        
        if (month >= 3 && month <= 5){
            return "Spring";
        } else if (month >= 6 && month <= 8){
            return "Summer";
        } else if (month >= 9 && month <= 11){
            return "Fall";
        } else {
            return "Winter";
        }
    }

    static boolean isExist(int year, int month, int day){
        if (month == 2){
            if (day == 29) {
                if (isYY(year)) return true;
                else return false;
            } else {
                if (day > 28) return false;
                else return true;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            if (day > 30) return false;
            return true;
        } else {
            if (day > 31) return false;
            return true;
        }
    }

    static boolean isYY(int year){
        if (year % 4 == 0){
            if (year % 100 == 0 && year % 400 == 0)
                return true;
            else if (year % 100 == 0)
                return false;
            
            return true;
        } else 
            return false;
    }
}