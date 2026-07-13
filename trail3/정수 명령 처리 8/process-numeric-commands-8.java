import java.util.Scanner;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String command = sc.nextLine();
            String[] arr = command.split(" ");
            if (arr.length == 1){
                if (arr[0].equals("pop_front")){
                    System.out.println(list.pollFirst());
                } else if (arr[0].equals("pop_back")){
                    System.out.println(list.pollLast());
                } else if (arr[0].equals("front")){
                    System.out.println(list.peekFirst());
                } else if (arr[0].equals("back")){
                    System.out.println(list.peekLast());
                } else if (arr[0].equals("empty")){
                    System.out.println(list.isEmpty() ? 1 : 0);
                } else if (arr[0].equals("size")){
                    System.out.println(list.size());
                }
            } else {
                if (arr[0].equals("push_back")){
                    list.addLast(Integer.parseInt(arr[1]));
                } else if (arr[0].equals("push_front")){
                    list.addFirst(Integer.parseInt(arr[1]));
                }
            }
        }

        
    }
}