import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        
        Code007 code = new Code007(sCode, mPoint, time);
        System.out.println(code.toString());

    }

    static class Code007{
        String sCode;
        char mPoint;
        int time;

        public Code007(String sCode, char mPoint, int time){
            this.sCode = sCode;
            this.mPoint = mPoint;
            this.time = time;
        }

        public String toString(){
            return "secret code : "+this.sCode+"\nmeeting point : "+this.mPoint+"\ntime : "+this.time;
        }
    }
}