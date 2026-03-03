import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(Integer.valueOf(arr[i]) + " ");
        }
        System.out.println();
        
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(arr2, Collections.reverseOrder());   // 객체 타입만 가능
        for (int i = 0; i < arr2.length; i++){
            System.out.print(Integer.valueOf(arr2[i]) + " ");
        }
    }
}