public class Main {
    public static void main(String[] args) {
        // main 함수가 static이기 때문에 함수도 static이어야 한다.
        for (int i = 0; i < 5; i++){
            print10Stars();
        }
    }
    
    static void print10Stars(){
        for (int i = 0; i < 10; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}