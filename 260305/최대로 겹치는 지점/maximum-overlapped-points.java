import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[101];
        
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start; j <= end; j++){
                line[j]++;
            }
        }
        System.out.println(Arrays.stream(line).max().getAsInt());
    }
}