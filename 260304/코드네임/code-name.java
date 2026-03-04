import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agent[] agents = new Agent[5];
        for (int i = 0; i < 5; i++){
            String name = sc.next();
            int score = sc.nextInt();

            agents[i] = new Agent(name, score);
        }

        int min = 101;
        int ans = -1;
        for (int i = 0; i < 5; i++){
            if (min > agents[i].score){
                ans = i;
                min = agents[i].score;
            }
        }

        System.out.print(agents[ans].cName + " " + agents[ans].score);
    }

    static class Agent{
        String cName;
        int score;

        public Agent(String name, int score){
            this.cName = name;
            this.score = score;
        }
    }
}