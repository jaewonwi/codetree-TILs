import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++){    // 하나 골라 2배
            arr[i] *= 2;
            for (int j = 0; j < n; j++){
                int sum = cal(j, arr);   // 나머지 중 인접 숫자간의 차의 합 계산
                ans = Math.min(ans, sum);
            }
            arr[i] /= 2;
        }
        System.out.println(ans);
    }

    static int cal(int idx, int[] arr){
        int[] nArr = new int[arr.length-1];
        for (int i = 0; i < idx; i++){
            nArr[i] = arr[i];
        }
        for (int i = idx+1; i < arr.length; i++){
            nArr[i-1] = arr[i];
        }
        
        int sum = 0;
        for (int i = 0; i < nArr.length-1; i++){
            sum += Math.abs(nArr[i] - nArr[i+1]);
        }
        return sum;
    }
}