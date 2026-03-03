import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        for (int i = 0; i < n1; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < n2; i++)
            b[i] = sc.nextInt();
        

        int s = 0, e = n1 - 1;
        boolean flag = false;
        while (s < n1){
            if (isSame(a, b, s)){
                flag = true;
                break;
            }
            s++;
        }

        System.out.print(flag ? "Yes" : "No");
    }

    static boolean isSame(int[] a, int[] b, int start){
        for (int i = 0; i < b.length; i++){
            if ((start + i) >= a.length) return false;
            if (a[start+i] != b[i]) return false;
        }

        return true;
    }
}