import java.util.*;

public class Main {
    
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        
        System.out.println(minSteps(nums));
    }
    
    public static int minSteps (int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int result = 0;
        
        while (low < high) {
            if (nums[low] == nums[high]) {
                low++;
                high--;
            } else if (nums[low] < nums[high]) {
                nums[low + 1] += nums[low];
                low++;
                result++;
            } else if (nums[low] > nums[high]) {
                nums[high - 1] += nums[high];
                high--;
                result++;
            }
        }
        
        return result;
    }
}