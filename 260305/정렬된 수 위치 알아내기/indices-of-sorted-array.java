import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        Number[] nums = new Number[n];
        for (int i = 0; i < n; i++){
            nums[i] = new Number(i+1, arr[i]);
        }

        Arrays.sort(nums, new Comparator<Number>() {
            @Override
            public int compare(Number n1, Number n2){
                return n1.num == n2.num ?
                            n1.idx - n2.idx :
                        n1.num - n2.num;
            }
        });

        int[] answer = new int[n];
        for (int i = 0; i < n; i++){
            answer[nums[i].idx-1] = i+1;    // 현재 i번째에 nums[i].idx번째 숫자가 있다는 뜻
        }
        
        for (int i = 0; i < n; i++){
            System.out.print(answer[i]+" ");
        }
    }

    public static class Number{
        int idx, num;
        public Number(int idx, int num){
            this.idx = idx;
            this.num = num;
        }
    }
}