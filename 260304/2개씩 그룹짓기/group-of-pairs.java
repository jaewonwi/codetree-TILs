import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++){
            max = Math.max(max, nums[i] + nums[nums.length-1-i]);    
        }
        System.out.print(max);
    }
}