import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int m = sc.nextInt();
        int d = sc.nextInt();
        
        System.out.println(season(y, m, d));
    }

    static String season(int y, int m, int d){
        if (!isExist(y, m, d))
            return "-1";
   
        if (m == 3 || m == 4 || m == 5) return "Spring";
        else if (m == 6 || m == 7 || m == 8) return "Summer";
        else if (m == 9 || m == 10 || m == 11) return "Fall";
        else return "Winter";
    }

    static boolean isExist(int y, int m, int d){
        if (m == 2){
            if (leapYear(y)){
                if (d <= 29)
                    return true;
            } else {
                if (d <= 28)
                    return true;
            }
        } else if (m == 4 || m == 6 || m == 9 || m == 11){
            if (d <= 30) return true;
        } else {
            if (d <= 31) return true;
        }

        return false;
    }

    static boolean leapYear(int y){
        if (y % 4 == 0){
            if (y % 100 == 0) {
                if (y % 400 == 0) return true;
                return false;
            }
            return true;
        }
        return false;
    }
    
}