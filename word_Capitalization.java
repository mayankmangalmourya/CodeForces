import java.util.*;

public class word_Capitalization {

    /*
     * Capitalization is writing a word with its first letter as a capital letter.
     * Your task is to capitalize the given word.
     *
     * Note, that during capitalization all the letters except the first one remains
     * unchanged.
     *
     * Input
     * A single line contains a non-empty word. This word consists of lowercase and
     * uppercase English letters. The length of the word will not exceed 103.
     *
     * Output
     * Output the given word after capitalization.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        if(str.length() > 0){
            String result = (str.charAt(0)+"").toUpperCase() + str.substring(1);
            System.out.println(result);
        }
        System.out.println("");
        in.close();

    }
}
