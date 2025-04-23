import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // 오름차순 정렬
        Arrays.sort(arr);
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 내림차순 정렬 -> Collections.reverseOrder() 사용해야한다. 하지만 얘는 primitive type은 안되기 대문에 Integer 배열로 변환해주어야 함.
        Integer[] rArr = Arrays.stream(arr).boxed().toArray(Integer[]::new); 
        Arrays.sort(rArr, Collections.reverseOrder());
        for (int i = 0; i < n; i++){
            System.out.print(rArr[i] + " ");
        }
    }
}