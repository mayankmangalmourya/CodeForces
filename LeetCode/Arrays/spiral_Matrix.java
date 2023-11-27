package LeetCode.Arrays;
import java.util.*;

public class spiral_Matrix {
    private static List<Integer> spiral_Order(int[][] matrix){
        List<Integer> result = new ArrayList<Integer>();
        int n = matrix.length;
        int m = matrix[0].length;
        int total = n * m;
        int count = 0;
        int top = 0;
        int down = n-1;
        int left = 0;
        int right = m-1;
        while(count < total){
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
                count++;
            }
            top++;
            for(int i = top; i <= down; i++){
                result.add(matrix[i][right]);
                count++;
            }
            right--;
            for(int i = right; i >= left; i--){
                result.add(matrix[down][i]);
                count++;
            }
            down--;
            for(int i = down; i >= top; i--){
                result.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        List<Integer> result = spiral_Order(matrix);
        System.out.println(result);
    }
}
