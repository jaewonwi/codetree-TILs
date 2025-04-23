import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int max = 0;
        int cnt = arr[0] > t ? 1 : 0;
        for (int i = 1; i < n; i++){
            if (!biggerT(t, arr[i-1], arr[i])){ // 앞, 현재 연속으로 t보다 크지 않음 <==> 앞에서부터 보고있으니까, 현재 값이 t보다 크면 cnt 1로, 아니면 0으로 초기화
                max = Math.max(cnt, max);
                if (arr[i] > t)
                    cnt = 1;
                else 
                    cnt = 0;
            } else {    // 앞에 것도 t보다 크고, 현재 것도 t보다 큼
                cnt++;
            }        
        }
        max = Math.max(cnt, max);
        System.out.println(max);
    }

    static boolean biggerT(int T, int prev, int next){
        if (prev > T && next > T) return true;
        return false;
    }
}