import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            nodes[i] = new Node(sc.nextInt(), i+1);
        }
        Arrays.sort(nodes);
        int[] ranks = new int[n];
        for (int i = 0; i < n; i++){
            ranks[nodes[i].idx-1] = i+1;
        }
        for (int i = 0; i < n; i++){
            System.out.print(ranks[i]+" ");
        }
    }
    
    public static class Node implements Comparable<Node>{
        int num, idx;

        public Node(int num, int idx){
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Node n){
            if (n.num == this.num){
                return 0;
            }
            return this.num - n.num;
        }
    }
}