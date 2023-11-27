package LeetCode.Arrays;

public class rotate_Image {
    public static void reverse(int row, int i, int j, int[][] matrix) {
        while (i < j) {
            int temp = matrix[row][i];
            matrix[row][i] = matrix[row][j];
            matrix[row][j] = temp;
            i++;
            j--;
        }
    }

    public static void swap(int i, int j, int[][] matrix) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public static void rotate(int[][] matrix) {
        // find transpose
        int n = matrix.length;
        int m = n;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                swap(i, j, matrix);
            }
        }
        // now reverse the every row
        for (int i = 0; i < n; i++) {
            reverse(i, 0, n - 1, matrix);
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        rotate(matrix);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
