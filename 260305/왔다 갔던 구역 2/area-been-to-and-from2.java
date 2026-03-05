import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] line = new int[2001];
        int cur = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            int d = 1;

            if (dir == 'R')
                d = 1;
            else
                d = -1;
            
            for (int j = 0; j < x; j++){
                line[cur]++;
                cur += d;
            }
        }

        int cnt = 0;
        for (int i = 0; i < line.length; i++){
            if (line[i] > 1) cnt++;    
        }
        System.out.println(cnt);
    }
}