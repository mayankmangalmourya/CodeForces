package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class diagonal_Traverse {
    public static int[] findDiagonalOrder(int[][] mat) {
        List<List<Integer>> map = new ArrayList<>();
        for(int i = 0; i < mat.length + mat[0].length-1; i++){
            map.add(new ArrayList<Integer>());
        }
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                map.get(i+j).add(mat[i][j]);
            }
        }
        int[] result = new int[mat.length * mat[0].length];
        int idx = 0;
        for(int i = 0; i < map.size(); i++){
            if(i % 2 != 0){
                for(int ele : map.get(i)){
                    result[idx++] = ele;
                }
            }else{
                for(int j = map.get(i).size()-1; j >= 0; j--){
                    result[idx++] = map.get(i).get(j);
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr = { { 3, 3, 1, 1 }, { 2, 2, 1, 2 }, { 1, 1, 1, 2 } };
        int[] result = findDiagonalOrder(arr);
        for(int ele : result){
            System.out.print(ele+" ");
        }
    }
}
