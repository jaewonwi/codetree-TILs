import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();
        for (int tc = 0; tc < n; tc++){
            String[] s = br.readLine().split(" ");
            if (s[0].equals("push_front")){
                int A = Integer.parseInt(s[1]);
                queue.addFirst(A);
            } else if (s[0].equals("push_back")){
                int A = Integer.parseInt(s[1]);
                queue.addLast(A);
            } else if (s[0].equals("pop_front")){
                int A = queue.pollFirst();
                System.out.println(A);
            } else if (s[0].equals("pop_back")){
                int A = queue.pollLast();
                System.out.println(A);
            } else if (s[0].equals("size")){
                System.out.println(queue.size());
            } else if (s[0].equals("empty")){
                System.out.println(queue.isEmpty() ? 1 : 0);
            } else if (s[0].equals("front")){
                System.out.println(queue.peekFirst());
            } else {
                System.out.println(queue.peekLast());
            }

        }
    }
}