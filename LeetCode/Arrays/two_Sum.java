package LeetCode.Arrays;
import java.util.*;

public class two_Sum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 5};
        int target = 7;
        int[] result = solution(nums, target);
        System.out.println(result[0] +" "+ result[1]);
    }

    private static int[] solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }else{
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
