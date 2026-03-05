import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        char[] bChars = binary.toCharArray();
        int[] bArr = new int[binary.length()];
        for (int i = 0; i < bChars.length; i++){
            bArr[i] = bChars[i] - '0';
        }
        
        int num = 0;
        for (int i = 0; i < bArr.length; i++){
            num = num * 2 + bArr[i];
        }
        System.out.println(num);
    }
}