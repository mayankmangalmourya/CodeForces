package LeetCode.Arrays;

public class next_Permutation{
    public static void main(String[] args) {
        int [] nums = new int[] {1,3,5};
        System.out.println("Next Permutation : " );
        nextPermutation(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] +" ");
        }
    }

    private static void nextPermutation(int[] nums){
        int idx1 = -1;
        int idx2 = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] < nums[i+1]){
                idx1 = i;
            }
        }
        if(idx1 == -1){
            reverse(nums, 0, nums.length-1);
        }else{
            for(int j = nums.length-1; j >= 0; j--){
                if(nums[j] > nums[idx1]){
                    idx2 = j;
                    break;
                }
            }
            swap(idx1, idx2, nums);
            reverse(nums, idx1+1, nums.length-1);
        }
    }
    static private void swap(int idx1, int idx2, int[] nums){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
    static private void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(i, j, nums);
            i++;
            j--;
        }
    }
}