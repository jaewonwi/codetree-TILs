import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        LinkedList<Character> list = new LinkedList<>();
    
        char[] chArr = br.readLine().toCharArray();
        for (char c : chArr){
            list.add(c);
        }

        // 맨 앞 , 맨 뒤, 빵과 빵 사이
        ListIterator<Character> it = list.listIterator(list.size());
        // L, R, D(바로 뒤 식빵 remove), P &(해당 위치에 &라는 식빵추가)
        
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            char comm = s.charAt(0);
            if (st.hasMoreTokens()){
                it.add(st.nextToken().charAt(0));
            } else {
                if (comm == 'L'){
                    if (it.hasPrevious())
                        it.previous();
                } else if (comm == 'R'){
                    if (it.hasNext())
                        it.next();  
                } else if (comm == 'D'){
                    if (it.hasNext()){
                        it.next();
                        it.remove();
                    }
                }
            }
        }

        it = list.listIterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()){
            sb.append(it.next());
        }

        System.out.println(sb);
    }
}