import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, k, size, start = 0, end, zero, t = 0;
    static int[] stablility, cnt;
    static List<Integer> people = new ArrayList<>();    // 사람의 위치. 즉, idx 저장

    public static void main(String[] args) throws Exception{
        // 입력
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        size = 2*n;
        stablility = new int[size];
        cnt = new int[size];
        end = n-1;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++){
            stablility[i] = Integer.parseInt(st.nextToken());
        }

        zero = 0;
        while (zero < k){   // true라고 해도 똑같을 것 같긴 함
            t++;    // 몇번째 실험인지

            // 1. 무빙 워크 회전
            start = (start - 1 + size) % size;
            end = (end - 1 + size) % size;
//            System.out.println(start+" & "+end);
            if (cnt[end] != 0){
                cnt[end]--;
                zero++;
            }

            // 2. 사람 이동
            if (people.size() > 0) move();

            // 0인 것의 개수가 k 이상이면
            if (zero >= k) break;

            // 3. 1번 칸에 사람이 없고, 안정성이 0이 아니면 +사람
            if (cnt[start] == 0 && stablility[start] != 0){
                people.add(start);
                cnt[start]++;
                stablility[start]--;
                if (stablility[start] == 0){
                    zero++;
                }
            }
        }
        System.out.println(t);
    }

    static void move(){   // idx: 몇번째 사람인지
        for (int i = 0; i < people.size(); i++){
            int cur = people.get(i);  // 이 사람의 위치
            int next = (cur + 1) % size;

            if (stablility[next] == 0 || cnt[next] != 0) return;

            cnt[cur]--;
            stablility[next]--;
            if (stablility[next] == 0) zero++;

            if (next == end) {
                people.remove(i);
                i--;
            } else {
                cnt[next]++;
                people.set(i, next);
            }
        }
    }
}
