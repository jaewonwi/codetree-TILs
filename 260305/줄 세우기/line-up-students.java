import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++){
            students[i] = new Student(i+1, height[i], weight[i]);
        }
        Arrays.sort(students);
        for (int i = 0; i < n; i++){
            Student s = students[i];
            System.out.printf("%d %d %d\n", s.h, s.w, s.n);
        }
        
    }    
}

class Student implements Comparable<Student>{
    int n, h, w;

    Student(int n, int h, int w){
        this.n = n;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Student o){    // compareTo는 public. 인터페이스 구현 시 반드시 같거나 더 넓은 접근제어자를 가져야 함
        return this.h == o.h?
                    this.w == o.w?
                        this.n - o.n :
                    o.w - this.w :
                o.h - this.h;
    }
}