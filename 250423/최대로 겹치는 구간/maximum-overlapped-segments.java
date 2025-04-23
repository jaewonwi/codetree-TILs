import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        // 지점이 겹치는 것 확인: x ~ y 까지 표기
        // 구간이 겹치는 것 확인: x ~ y-1 까지 표기
        int[] area = new int[201];
        int offset = 100;   // 음수 인덱스는 계산하기 번거롭기 때문에 offset을 더한다.
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt() + offset;
            y[i] = sc.nextInt() + offset;
            for (int j = x[i]; j < y[i]; j++){
                area[j]++;
            }
        }

        int max = 0;
        for (int i = 0; i <= 200; i++){
            max = Math.max(area[i], max);
        }
        System.out.println(max);
    }
}