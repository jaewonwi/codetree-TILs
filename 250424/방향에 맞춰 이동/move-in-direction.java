import java.util.Scanner;
public class Main {
    static int sy = 0, sx = 0;
    static int[] dy = {-1,1,0,0}, dx = {0,0,-1,1};  // 하상좌우
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            move(direction, distance);
        }

        System.out.println(sx+" "+sy);
    }

    static void move(char d, int dist){
        if (d == 'N'){  // 상
            sy += dy[1] * dist;
        } else if (d == 'S'){   // 하
            sy += dy[0] * dist;
        } else if (d == 'W'){   // 좌
            sx += dx[2] * dist;
        } else {    // 우
            sx += dx[3] * dist;
        }
    }
}