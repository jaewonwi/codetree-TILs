import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        People[] people = new People[n];
        for (int i = 0; i < n; i++){
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            people[i] = new People(name, height, weight);
        }
        
        Arrays.sort(people);
        for (int i = 0; i < n; i++){
            System.out.println(people[i].name+" "+people[i].h+" "+people[i].w);
        }
    }

    static class People implements Comparable<People>{
        String name;
        int h, w;

        public People(String n, int h, int w){
            this.name = n;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(People p){
            return this.h - p.h;
        }
    }
}