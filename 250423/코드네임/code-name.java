import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agent[] agents = new Agent[5];
        for (int i = 0; i < 5; i++){
            agents[i] = new Agent(sc.next().charAt(0), sc.nextInt());
        }

        char minName = agents[0].name;
        int minScore = agents[0].score;
        for (int i = 1; i < 5; i++){
            if (agents[i].score < minScore){
                minName = agents[i].name;
                minScore = agents[i].score;
            }
        }

        System.out.println(minName+" "+minScore);
    }

    public static class Agent{
        char name;
        int score;

        public Agent(char name, int score){
            this.name = name;
            this.score = score;
        }
    }
}