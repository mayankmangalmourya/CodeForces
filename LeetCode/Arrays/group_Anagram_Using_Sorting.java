package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class group_Anagram_Using_Sorting {

    public String sort_String_Freq_Array(String str) {
        int[] freq = new int[26];
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            int cur_freq = freq[i];
            while (cur_freq-- != 0) {
                result.append(i + 'a');
            }
        }
        return result.toString();
    }

    static public String sort_String(String str){
        char[] char_arr = str.toCharArray();
        Arrays.sort(char_arr);
        return new String(char_arr);
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            String sorted_string = sort_String(str);
            if(map.containsKey(sorted_string)){
                map.get(sorted_string).add(str);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(sorted_string, temp);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(Map.Entry<String, List<String>> itr : map.entrySet()){
            result.add(itr.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(str);
        System.out.println(result);
    }
}
