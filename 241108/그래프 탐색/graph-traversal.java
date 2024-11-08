import java.util.*;

public class Main {
    static int cnt = 0;
    static boolean[] visit;
    static List<List<Integer>> adjList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();        
        int M = sc.nextInt();

        visit = new boolean[N];
        for (int i = 0; i <= N; i++){
            adjList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++){
            int a = sc.nextInt();        
            int b = sc.nextInt();
            
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        visit[1] = true;      
        dfs(1);

        System.out.println(cnt);   
    }

    static void dfs(int idx){
        for (int i : adjList.get(idx)){
            if (!visit[i]){
                cnt ++;
                visit[i] = true;
                dfs(i);
            }
        }
    }
}