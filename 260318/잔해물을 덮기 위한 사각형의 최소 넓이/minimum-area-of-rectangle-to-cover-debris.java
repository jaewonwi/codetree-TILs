import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt()+1000;
        int rect1_y1 = sc.nextInt()+1000;
        int rect1_x2 = sc.nextInt()+1000;
        int rect1_y2 = sc.nextInt()+1000;

        int rect2_x1 = sc.nextInt()+1000;
        int rect2_y1 = sc.nextInt()+1000;
        int rect2_x2 = sc.nextInt()+1000;
        int rect2_y2 = sc.nextInt()+1000;
        
        boolean[][] map = new boolean[2001][2001];
        // 1. 겹치는 부분 제외
        // 2. 1번사각형 범위 보면서 -> 제일 왼쪽,오른쪽,위,아래 좌표 찾기
        for (int i = rect1_y1; i < rect1_y2; i++){
            for (int j = rect1_x1; j < rect1_x2; j++){
                map[i][j] = true;
            }
        }
        
        for (int i = rect2_y1; i < rect2_y2; i++){
            for (int j = rect2_x1; j < rect2_x2; j++){
                map[i][j] = false;
            }
        }

        int left = 3000, bottom = 3000;
        int top = 0, right = 0;
        for (int i = rect1_y1; i < rect1_y2; i++){
            for (int j = rect1_x1; j < rect1_x2; j++){
                if (!map[i][j]) continue;

                if (left > j){
                    left = j;
                }

                if (bottom > i){
                    bottom = i;
                }

                if (top < i){
                    top = i;
                }

                if (right < j){
                    right = j;
                }
            }
        }
        
        System.out.print((right - left + 1) * (top - bottom + 1));
    }
}