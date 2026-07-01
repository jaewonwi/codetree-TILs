import java.util.*;

public class Main {
    static int N;
    static ArrayList<Integer> arrList = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = Integer.parseInt(sc.nextLine());
        for (int tc = 1; tc <= N; tc++) {
            String[] st = sc.nextLine().split(" ");
            String order = st[0];
            
            if (order.equals("size")) {
                System.out.println(size());
                continue;
            } else if (order.equals("pop_back")){
                pop_back();
                continue;
            } else if (order.equals("push_back")){
                int num = Integer.parseInt(st[1]);
                push_back(num);
            } else {
                int num = Integer.parseInt(st[1]) - 1;
                System.out.println(get(num));
            }
        }
    }

    public static void push_back(int A) {
        arrList.add(A);
    }

    public static void pop_back() {
        arrList.remove(arrList.size() - 1);
    }

    public static int size() {
        return arrList.size();
    }

    public static int get(int k) {
        return arrList.get(k);    
    }

}