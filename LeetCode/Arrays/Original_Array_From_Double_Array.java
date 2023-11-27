package LeetCode.Arrays;

import java.util.HashMap;

public class Original_Array_From_Double_Array {
    public static int[] get_Original_Array(int[] changed){
        int len = changed.length;
        if(len % 2 != 0){
            return new int[0];
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < changed.length; i++){
            Integer c = map.get(changed[i]);
            if(!map.containsKey(changed[i])){
                map.put(changed[i], 1);
            }else{
                map.put(changed[i], ++c);
            }
        }
        // System.out.println(map);
        int[] result = new int[changed.length/2];
        int idx = 0;
        for(int i = 0; i < changed.length; i++){
            int ele = changed[i];
            if(map.get(ele) == 0){
                continue;
            }
            map.put(ele, map.get(ele)-1);
            if(map.containsKey(ele*2)){
                map.put(ele*2, map.get(ele*2)-1);
                result[idx++] = ele;
            }else{
                return new int[0];
            }
            // System.out.println(map);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,8};
        int[] result = get_Original_Array(arr);
        for(int ele : result) {
            System.out.print(ele + " ");
        }
    }
}
