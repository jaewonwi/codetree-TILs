import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
        }
        
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++){
            person[i] = new Person(names[i], heights[i], weights[i]);
        }
        System.out.println("name");
        Arrays.sort(person, (o1, o2) -> o1.name.compareTo(o2.name));
        print(person);
        System.out.println();

        System.out.println("height");
        Arrays.sort(person, (o1, o2) -> o2.h - o1.h);
        print(person);
    }

    static class Person{
        String name;
        int h;
        double w;

        public Person(String name, int h, double w){
            this.name = name;
            this.h = h;
            this.w = w;
        }
    }

    public static void print(Person[] person){
        for (int i = 0; i < 5; i++){
            System.out.printf("%s %d %.1f\n",person[i].name, person[i].h, person[i].w);
        }
    }
}