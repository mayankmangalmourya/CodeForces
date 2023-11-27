package LeetCode.Arrays;

public class sort_Colors {
    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void sortColors(int[] nums) {
        int i = 0;
        int j = 0;
        int k = nums.length - 1;
        while (j <= k) {
            if (nums[j] == 1) {
                j++;
            } else if (nums[j] == 2) {
                swap(j, k, nums);
                k--;
            } else {
                swap(j, i, nums);
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,0,2,2,2,1,2,0};
        sortColors(arr);
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
