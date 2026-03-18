import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int offset = 1000;
        int rect1_x1 = sc.nextInt() + offset;
        int rect1_y1 = sc.nextInt() + offset;
        int rect1_x2 = sc.nextInt() + offset;
        int rect1_y2 = sc.nextInt() + offset;
        int rect2_x1 = sc.nextInt() + offset;
        int rect2_y1 = sc.nextInt() + offset;
        int rect2_x2 = sc.nextInt() + offset;
        int rect2_y2 = sc.nextInt() + offset;
        
        boolean[][] arr = new boolean[2001][2001];
        // 1
        for (int i = rect1_x1; i < rect1_x2; i++){
            for (int j = rect1_y1; j < rect1_y2; j++){
                arr[i][j] = true;
            }
        }

        // 2
        for (int i = rect2_x1; i < rect2_x2; i++){
            for (int j = rect2_y1; j < rect2_y2; j++){
                arr[i][j] = false;
            }
        }

        // rem range
        int minx = 2001, miny = 2001;
        int maxx = 0, maxy = 0;
        for (int i = rect1_x1; i < rect1_x2; i++){
            for (int j = rect1_y1; j < rect1_y2; j++){
                if (arr[i][j]){
                    if (i < minx)   minx = i;
                    if (j < miny)   miny = j;
                    if (i > maxx)   maxx = i;
                    if (j > maxy)   maxy = j;
                }
            }
        }

        // print(arr, rect1_x2+1, rect1_y2+1);
        int ans = (maxx-minx+1) * (maxy-miny+1);
        if (minx == 2001 && miny == 2001) ans = 0;
        System.out.println(ans);
    }

    static void print(boolean[][] arr, int x, int y){
        for (int i = 1000; i < x; i++){
            for (int j = 1000; j < y; j++){
                if (arr[i][j]) System.out.print("O");
                else System.out.print("X");
            }
            System.out.println();
        }
        System.out.println("======================");
    }
}