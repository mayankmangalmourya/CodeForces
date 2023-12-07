package LeetCode.Arrays;

public class sum_Even_After_Queries {
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sumEven = 0;
        int[] result = new int[nums.length];
        int itr = 0;
        for (int ele : nums) {
            if (ele % 2 == 0) {
                sumEven += ele;
            }
        }
        for (int[] query : queries) {
            int val = query[0];
            int idx = query[1];
            if (nums[idx] % 2 == 0) {
                sumEven -= nums[idx];
                nums[idx] += val;
                if (nums[idx] % 2 == 0) {
                    sumEven += nums[idx];
                    result[itr++] = sumEven;
                } else {
                    result[itr++] = sumEven;
                }
            } else {
                nums[idx] += val;
                if (nums[idx] % 2 == 0) {
                    sumEven += nums[idx];
                    result[itr++] = sumEven;
                } else {
                    result[itr++] = sumEven;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        // nums = [1,2,3,4], queries = [[1,0],[-3,1],[-4,0],[2,3]]
        int[] nums = {1,2,3,4};
        int[][] queries = {{1,0},{-3,1},{-4,0},{2,3}};
        int[] result = sumEvenAfterQueries(nums, queries);
        for(int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
