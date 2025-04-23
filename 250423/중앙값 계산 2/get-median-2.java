import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                if ((i+1) < n){
                    Arrays.sort(arr, 0, i+1);
                } else {
                    Arrays.sort(arr, 0, i);
                }
                System.out.print(arr[i/2]+" ");
            }
        }   
    }
}