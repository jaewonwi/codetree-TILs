import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int offset = 10000;
        int cur = offset;
        int[] color = new int[offset * 2 + 2];    // 마지막으로 칠한 색 (white 1, black 2, grey -1)
        int[] cntB = new int[offset * 2 + 2];    // 덧칠한 횟수
        int[] cntW = new int[offset * 2 + 2];    // 덧칠한 횟수
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);

            int dir = 0;
            int c = 0;
            if (d == 'L'){
                dir = -1;
                c = 1;

                for (int j = 0; j < x; j++){
                    cntW[cur]++;
                    color[cur] = (cntW[cur] >= 2 && cntB[cur] >= 2) ? -1 : c;
                    cur += dir;
                }
                cur -= dir; 
            } else {
                dir = 1;
                c = 2;

                for (int j = 0; j < x; j++){
                    cntB[cur]++;
                    color[cur] = (cntW[cur] >= 2 && cntB[cur] >= 2) ? -1 : c;
                    cur += dir;
                }
                cur -= dir;
            }
        }
        
        int white = 0;
        int black = 0;
        int grey = 0;
        
        for (int i = 0; i < color.length; i++){
            if (color[i] == 1)
                white++;
            else if (color[i] == 2)
                black++;
            else if (color[i] == -1)
                grey++;
        }

        System.out.println(white+" "+black+" "+grey);
    }
}