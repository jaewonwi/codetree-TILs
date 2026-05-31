import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 == len2){
            System.out.println("same");
        } else {
            System.out.println(len1 > len2 ? (str1+" "+len1) : (str2+" "+len2));
        }
    }
}