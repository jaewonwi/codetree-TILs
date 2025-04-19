import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] arr = new int[4][4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < 4; i++){
            int sum = 0;
            for (int j = 0; j < 4; j++){
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
}