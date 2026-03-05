import java.util.Scanner;
public class Main {
    static int[] binary = new int[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = toTen(str);
        n *= 17;
        int cnt = toBinary(n);

        for (int i = cnt - 1; i >= 0; i--){
            System.out.print(binary[i]);
        }
    }

    public static int toTen(String str){
        char[] chArr = str.toCharArray();
        int result = 0;
        for (int i = 0; i < chArr.length; i++){
            if (chArr[i] == '1'){
                result = result * 2 + 1;
            }
        }
        return result;
    }

    public static int toBinary(int n){
        int cnt = 0;
        while (n > 0){
            binary[cnt++] = n % 2;
            n /= 2;
        }
        return cnt;
    }
}