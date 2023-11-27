package LeetCode.Arrays;

public class trapping_rain_water_problem {
    public static void main(String[] args) {
        int[] height = new int[]{4,2,0,3,2,5};
        System.out.println(solution(height));
    }

    private static int solution(int[] height) {
        int len = height.length;
        int sum = 0;
        int[] left_Max_Height  = LMH(height, len);
        int[] right_Max_Height = RMH(height, len);
        for(int i = 0; i < len; i++) {
            int min = Math.min(left_Max_Height[i], right_Max_Height[i]) - height[i];
            int area = min;
            sum += area;
        }
        return sum;
    }

    private static int[] RMH(int[] height, int len) {
        int[] result = new int[len];
        result[len-1] = height[len-1];
        for(int i = len-2; i >= 0; i--){
            result[i] = Math.max(result[i+1], height[i]);
        }
        return result;
    }

    private static int[] LMH(int[] height, int len) {
        int[] result = new int[len];
        result[0] = height[0];
        for(int i = 1; i < len; i++){
            result[i] = Math.max(result[i-1], height[i]);
        }
        return result;
    }
}
