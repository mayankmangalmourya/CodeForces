package Codechef.starter111;

import java.util.Scanner;

public class beautifulString {

    public static int[] freq(String str){
        int[] result = new int[26];
        for(int i=0; i<str.length(); i++){
            result[str.charAt(i) - '0']++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // number of test cases
        while (t-- != 0) {

            int n = in.nextInt();

            String str = in.next();

            int[] result = freq(str);

            long ans = 1;
            for (int i = 0; i < 26; i++) {
                if (result[i] > 0) {
                    int val = (result[i] + 1) % 1000000007;
                    ans = (ans * val) % 1000000007;
                }
            }
            System.out.println(ans - 1);

        }
        in.close();
    }

}
