import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Goods goods1 = new Goods();
        Goods goods2 = new Goods();

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int code = sc.nextInt();
        
        goods2 = new Goods(name, code);

        System.out.printf("product %d is %s\n", goods1.code, goods1.name);
        System.out.printf("product %d is %s\n", goods2.code, goods2.name);
    }

    static class Goods{
        String name;
        int code;

        public Goods(){
            this.name = "codetree";
            this.code = 50;
        }

        public Goods(String name, int code){
            this.name = name;
            this.code = code;
        }
    }
}