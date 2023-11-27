package LeetCode.Arrays;

public class container_With_most_Water {

    private static int max_Water(int[] height){
        // use two pointer technique
        int ptr1 = 0;
        int ptr2 = height.length-1;
        int w = 0;
        int h = 0;
        int maxArea = Integer.MIN_VALUE;
        while(ptr1 < ptr2){
            h = Math.min(height[ptr1], height[ptr2]);
            w = ptr2 - ptr1;
            int area = h * w;
            maxArea = Math.max(maxArea, area);
            if(height[ptr1] < height[ptr2]){
                ptr1++;
            }else{
                ptr2--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        // area with max water
        System.out.println("Area with max water : "+ max_Water(height));
    }
}
