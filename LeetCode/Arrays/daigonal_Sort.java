package LeetCode.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class daigonal_Sort {
    public static int[][] diagonalSort(int[][] mat) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(map.containsKey(i-j)){
                    map.get(i-j).add(mat[i][j]);
                }else{
                    PriorityQueue<Integer> pq = new PriorityQueue<>();
                    pq.add(mat[i][j]);
                    map.put(i-j, pq);
                }
            }
        }
        
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                int ele = map.get(i-j).poll();
                mat[i][j] = ele;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] matrix = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
        int[][] result = diagonalSort(matrix);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
