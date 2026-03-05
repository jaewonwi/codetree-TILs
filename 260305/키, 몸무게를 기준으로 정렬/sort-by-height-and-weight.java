import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] heights = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextInt();
        }
        
        Person[] person = new Person[n];
        for (int i = 0; i < n; i++){
            person[i] = new Person(names[i], heights[i], weights[i]);
        }
        
        Arrays.sort(person);
        print(person);   
    }

    public static class Person implements Comparable<Person>{
        String name;
        int h, w;

        public Person(String name, int h, int w){
            this.name = name;
            this.h = h;
            this.w = w;
        }

        @Override
        public int compareTo(Person o){
            return this.h == o.h ?
                        o.w - this.w :
                    this.h - o.h;
        }
    }

    public static void print(Person[] person){
        for (int i = 0; i < person.length; i++){
            System.out.printf("%s %d %d\n",person[i].name, person[i].h, person[i].w);
        }
    }
}