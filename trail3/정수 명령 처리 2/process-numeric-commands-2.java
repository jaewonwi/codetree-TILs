import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new ArrayDeque<>();
        for (int tc = 0; tc < n; tc++){
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push")){
                int A = Integer.parseInt(s[1]);
                queue.add(A);
            } else if (s[0].equals("pop")){
                int A = queue.poll();
                System.out.println(A);
            } else if (s[0].equals("size")){
                System.out.println(queue.size());
            } else if (s[0].equals("empty")){
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else {
                System.out.println(queue.peek());
            }

        }
    }
}