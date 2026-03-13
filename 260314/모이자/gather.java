import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] dist = new int[n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (j == i) continue;
                int diff = Math.abs(i-j);
                dist[i] += a[j] * diff;
            }
        }

        System.out.println(Arrays.stream(dist).min().getAsInt());
    }
}