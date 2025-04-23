import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] sts = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score1 = sc.nextInt();
            int score2 = sc.nextInt();
            int score3 = sc.nextInt();
            sts[i] = new Student(name, score1, score2, score3);
        }
        
        Arrays.sort(sts);
        for (int i = 0; i < n; i++){
            System.out.println(sts[i].toString());
        }
    }

    public static class Student implements Comparable<Student>{
        String name;
        int s1, s2, s3;

        public Student(String name, int s1, int s2, int s3){
            this.name = name;
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
        }

        @Override
        public int compareTo(Student st){
            return (this.s1+this.s2+this.s3) - (st.s1+st.s2+st.s3);
        }

        public String toString(){
            return this.name+" "+this.s1+" "+this.s2+" "+ this.s3;
        }
    }
}