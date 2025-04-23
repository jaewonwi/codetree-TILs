import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){
            int height = sc.nextInt();
            int weight = sc.nextInt();
            students[i] = new Student(height, weight, i+1);
        }
        
        Arrays.sort(students);
        for (int i = 0; i < n; i++){
            System.out.println(students[i].toString());
        }
    }

    static class Student implements Comparable<Student>{
        int h, w, no;

        public Student(int h, int w, int no){
            this.h = h;
            this.w = w;
            this.no = no;
        }

        @Override
        public int compareTo(Student s){
            return s.h == this.h ? 
                        s.w == this.w ?
                            this.no - s.no
                        : s.w - this.w 
                    : this.h - s.h;
        }

        public String toString(){
            return this.h+" "+this.w+" "+this.no;
        }
    }
}