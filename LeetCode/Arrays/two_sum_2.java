package LeetCode.Arrays;

// Array is sorted in this question.
public class two_sum_2 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 7, 11, 5 };
        int target = 7;
        int[] result = solution(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] solution(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        int ptr1 = 0;
        int ptr2 = nums.length-1;
        while (ptr1 < ptr2){
            if(nums[ptr1] + nums[ptr2] == target){
                return new int[]{ptr1+1, ptr2+1};
            }else if(nums[ptr1] + nums[ptr2] < target){
                ptr1++;
            }else{
                ptr2++;
            }
        }
        return result;
    }
}
