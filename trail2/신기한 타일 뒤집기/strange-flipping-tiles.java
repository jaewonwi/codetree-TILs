import java.io.*;
import java.util.*;

public class Main {
    static int N, cur;
    static int[] arr, ans;
    public static void main(String[] args) throws Exception{
        // 회색타일 - 왼쪽으로 흰색, 오른쪽으로 검은색
        // 현재위치 포함 x칸 타일을 뒤집는다. -> 마지막으로 뒤집은 칸에 서있음
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        arr = new int[2 * 100000 + 1];
        cur = 100000;

        for (int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            if (c == 'L'){
                move(n, -1);
            } else {
                move(n, 1);
            }
        }

        ans = new int[2];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == -1){
                ans[0]++;
            } else if (arr[i] == 1){
                ans[1]++;
            }
        }

        System.out.printf("%d %d", ans[0], ans[1]);
    }

    public static void move(int n, int d){
        for (int i = 0; i < n; i++){
            arr[cur] = d;
            cur += d;
        }
        cur -= d;
    }
}