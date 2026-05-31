import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++){
            String str = br.readLine().trim();
            int len = str.length();
            min = Math.min(min, len);
            max = Math.max(max, len);
        }

        System.out.print(max-min);
    }
}