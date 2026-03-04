import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        int level = sc.nextInt();
        
        User user1 = new User();
        User user2 = new User(id, level);

        System.out.printf("user %s lv %d\n", user1.id, user1.lv);
        System.out.printf("user %s lv %d\n", user2.id, user2.lv);
    }

    static class User{
        String id;
        int lv;

        public User(){
            this.id = "codetree";
            this.lv = 10;
        }

        public User(String id, int lv){
            this.id = id;
            this.lv = lv;   
        }
    }
}