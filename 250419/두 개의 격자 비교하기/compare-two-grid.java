import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[][] arr1 = new int[N][M];
        int[][] arr2 = new int[N][M];
        int[][] nArr = new int[N][M];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                arr1[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                arr2[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                if (arr1[i][j] != arr2[i][j])
                    nArr[i][j] = 1;
            }
        }

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                System.out.print(nArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}