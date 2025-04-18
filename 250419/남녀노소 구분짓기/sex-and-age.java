import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();  // 0: 남자, 1: 여자
        int age = sc.nextInt();

        if (gender == 0){
            if (age >= 19){
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (age >= 19){
                System.out.println("WOMAN");
            } else{
                System.out.println("GIRL");
            }

        }
    }
}