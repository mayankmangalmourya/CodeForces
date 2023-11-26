import java.util.*;

public class way_To_Long_Words {

    /*
    Sometimes some words like "localization" or "internationalization" are so long
    that writing them many times in one text is quite tiresome.

    Let's consider a word too long, if its length is strictly more than 10 characters.
    All too long words should be replaced with a special abbreviation.

    Abbreviation : write first letter + No of letter(remain) + write last letter.
    for example :
    "localization" will be spelt as "l10n", and "internationalization» will be spelt as "i18n".

     */

    static Scanner in;
    public static void solve(){
        String str = in.next();
        int len = str.length();
        if(len <= 10){
            System.out.println(str);
        }else{
            char first_char = str.charAt(0);
            char last_char = str.charAt(len - 1);
            StringBuilder result = new StringBuilder();
            result.append(first_char);
            result.append(len-2);
            result.append(last_char);
            System.out.println(result.toString());
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        int t = in.nextInt();
        while (t != 0) {
            solve();
            t--;
        }
        in.close();
    }
}
