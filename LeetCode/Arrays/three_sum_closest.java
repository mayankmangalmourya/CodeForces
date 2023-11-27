package LeetCode.Arrays;
import java.util.*;

public class three_sum_closest {
    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        System.out.println("The closest sum to the target is " + threeSumClosest(nums,target));
    }

    private static int threeSumClosest(int[] nums, int target) {
        int result = 100000;
        int len = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < len-2; i++) {
            int ptr1 = i+1;
            int ptr2 = len-1;
            while(ptr1 < ptr2){
                int sum = nums[i] + nums[ptr1] + nums[ptr2];
                if(Math.abs(target - sum) < Math.abs(target - result)){
                    result = sum;
                }
                if(sum < target){
                    ptr1++;
                }else{
                    ptr2--;
                }
            }
        }
        return result;
    }
}
