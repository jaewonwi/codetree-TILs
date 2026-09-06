import java.util.Scanner;

public class Main {
    static int[] dy = {-1, 0, 1, 0}, dx = {0, 1, 0, -1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;
        char D = sc.next().charAt(0);

        int d = getDir(D);

        int[][] arr = new int[N][N];
        for (int t = 0; t < T; t++){
            int ny = R + dy[d];
            int nx = C + dx[d];
            if (canGo(ny, nx, N)){
                R = ny;
                C = nx;
            } else {
                d = changeDir(d);
            }
        }

        System.out.println((R+1) + " " + (C+1));
    }   

    public static int changeDir(int d){
        return (d + 2) % 4;
    }

    public static boolean canGo(int ny, int nx, int N){
        if (ny < 0 || ny >= N || nx < 0 || nx >= N) return false;
        return true;
    }

    public static int getDir(char c){
        if (c == 'U') return 0;
        else if (c == 'R') return 1;
        else if (c == 'D') return 2;
        else return 3;
    }
    
}