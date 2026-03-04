import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        
        Info i = new Info(uCode, lColor, time);
        System.out.println("code : "+i.uCode);
        System.out.println("color : "+i.lColor);
        System.out.println("second : "+i.time);
    }

    static class Info{
        String uCode;
        char lColor;
        int time;

        public Info(String uCode, char lColor, int time){
            this.uCode = uCode;
            this.lColor = lColor;
            this.time = time;
        } 
    }
}