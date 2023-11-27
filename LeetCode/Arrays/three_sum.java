package LeetCode.Arrays;
import java.util.*;

public class three_sum {
    static List<List<Integer>> result;
    public static void main(String[] args) {
        int[] nums = new int[] {-1,0,1,2,-1,-4};
        int target = 0;
        List<List<Integer>> result = solution(nums, target);
        System.out.println(result);
        
    }

    private static void two_sum(int[] nums, int target, int i, int j){
        while(i < j){
            if(nums[i] + nums[j] < target){
                i++;
            }else if(nums[i] + nums[j] > target){
                j--;
            }else{
                // we have to remove duplicate element.
                while(i < j && nums[i] ==  nums[i+1]){
                    i++;
                }
                while(i < j && nums[j] == nums[j-1]){
                    j--;
                }
                List<Integer> sub_result = new ArrayList<Integer>();
                sub_result.add(-target);
                sub_result.add(nums[i]);
                sub_result.add(nums[j]);
                result.add(sub_result);
                i++;
                j--;
            }
        }
    }

    private static List<List<Integer>> solution(int[] nums, int target) {
        result = new ArrayList<>();
        Arrays.sort(nums);
        int n =  nums.length;
        if(n < 3){
            return result;
        }
        for (int i = 0; i < nums.length-2; i++) {
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int n1 = nums[i];
            int new_target = -n1;
            //apply two_sum here
            two_sum(nums, new_target, i+1, n-1);
        }
        return result;
    }
}
