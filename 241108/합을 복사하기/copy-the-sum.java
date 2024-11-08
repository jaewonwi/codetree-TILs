public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        c = b = a = a + b + c;
        System.out.println(a+ " "+b+ " "+c);
    }
}