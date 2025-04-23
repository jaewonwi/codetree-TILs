import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pos[] points = new Pos[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points[i] = new Pos(x, y, i+1);
        }
        Arrays.sort(points);
        for (int i = 0; i < n; i++){
            System.out.println(points[i].n);
        }   
    }

    public static class Pos implements Comparable<Pos>{
        int x, y, d, n;
        
        public Pos(int x, int y, int n){
            this.x = x;
            this.y = y;
            this.n = n;
            this.d = Math.abs(x - 0) + Math.abs(y - 0);
        }

        @Override
        public int compareTo(Pos p){
            return this.d == p.d ? this.n - p.n : this.d - p.d;
        }
    }
}