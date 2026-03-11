import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt()-1;
            b[i] = sc.nextInt()-1;
            c[i] = sc.nextInt()-1;
        }
        
        int max = 0;
        int ans = 0;
        for (int i = 0; i < 3; i++){
            int cnt = check(i, n, a, b, c);
            if (cnt > max){
                // System.out.println(i +" -> "+cnt);
                ans = i;
                max = cnt;
            }
        }
        System.out.println(max);
    }

    static int check(int idx, int n, int[] a, int[] b, int[] c){
        boolean[] cups = new boolean[3];
        cups[idx] = true;

        int cnt = 0;
        for (int i = 0; i < n; i++){
            swap(cups, a[i], b[i]);
            if (cups[c[i]]) 
                cnt++;
        }
        return cnt;
    }

    static void swap(boolean[] cups, int a, int b){
        boolean temp = cups[a];
        cups[a] = cups[b];
        cups[b] = temp;
    }
}