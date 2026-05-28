import java.util.Scanner;

public class Main {
    static int x, y, d;
    static int[] dy = {1,0,-1,0}, dx = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        x = 0; 
        y = 0;
        d = 0;
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (c == 'L'){
                d = (d + 4 - 1) % 4;
            } else if (c == 'R'){
                d = (d + 1) % 4;
            } else {
                x += dx[d];
                y += dy[d];
            }
        }   

        System.out.print(x+" "+y);
    }
}