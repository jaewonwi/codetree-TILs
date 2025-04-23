import java.util.Scanner;
public class Main {
    static int[] arr = new int[2001];
    static int offset = 1000, cur = 1000;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            move(x, dir);
        }

        int cnt = 0;
        for (int i = 0; i <= 2000; i++){
            if (arr[i] >= 2)
                cnt++;
        }
        System.out.println(cnt);
    }

    static void move(int x, char dir){
        // cur ~ y까지 이동(x만큼 이동)
        if (dir == 'R'){
            int y = cur + x;
            for (int i = cur; i < y; i++){
                arr[i]++;
            }
            cur = y;
        } else {
            int y = cur - x;
            for (int i = cur-1; i >= y; i--){
                arr[i]++;
            }
            cur = y;
        }
    }
}