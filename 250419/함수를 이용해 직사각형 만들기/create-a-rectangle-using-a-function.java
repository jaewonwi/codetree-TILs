import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowNum = sc.nextInt();
        int colNum = sc.nextInt();
        printRect(rowNum, colNum);
    }

    static void printRect(int r, int c){
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                System.out.print(1);
            }
            System.out.println();
        }
    }
}