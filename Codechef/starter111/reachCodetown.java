package Codechef.starter111;
import java.util.*;

public class reachCodetown {
    public static boolean isVowel(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        // vowel = 3;
        // consonent = 5;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- != 0) {
            String str = in.next();
            String res = "CODETOWN";
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                char ch2 = res.charAt(i);
                if (isVowel(ch) && isVowel(ch2)) {
                    count++;
                    continue;
                } else if (!isVowel(ch) && !isVowel(ch2)) {
                    count++;
                    continue;
                } else {
                    System.out.println("NO");
                    break;
                }
            }
            if (count == 8) {
                System.out.println("YES");
            }
        }
        in.close();
    }
}
