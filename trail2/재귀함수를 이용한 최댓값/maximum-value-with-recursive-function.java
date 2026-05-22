import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int max = 0;
        System.out.println(getMax(arr, n-1, max));
    }

    public static int getMax(int[] arr, int idx, int max){
        if (idx == -1){
            return max;
        }
        return getMax(arr, idx-1, Math.max(max, arr[idx]));
    }
}