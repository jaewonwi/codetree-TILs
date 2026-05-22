import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N+1];

        if (N == 1) {
            System.out.println(2);
            return;
        } else if (N== 2){
            System.out.println(4);
            return;
        }

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        System.out.println(fill(arr, N));
    }

    public static int fill(int[] arr, int idx){
        if (idx <= 0){
            return 1;
        }

        if (arr[idx] != 0){
            return arr[idx];
        }

        return fill(arr, idx-1) * fill(arr, idx-2) % 100;
    } 
}