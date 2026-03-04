import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Person> person = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            String address = sc.next();
            String region = sc.next();
            person.add(new Person(name, address, region));
        }

        Collections.sort(person);   // List 정렬 Collections

        System.out.println("name "+ person.get(person.size()-1).n);
        System.out.println("addr "+ person.get(person.size()-1).a);
        System.out.println("city "+ person.get(person.size()-1).r);
    }

    static class Person implements Comparable<Person>{
        String n, a, r;
        public Person(String n, String a, String r){
            this.n = n;
            this.a = a;
            this.r = r;
        }

        @Override
        public int compareTo(Person o){
            return this.n.compareTo(o.n);   // 문자열 비교
        }
    }
}