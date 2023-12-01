import java.util.*;

public class word {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int uppercase = 0;
        int lowercase = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) <= 'Z' && str.charAt(i) >= 'A'){
                uppercase++;
            }else{
                lowercase++;
            }
        }
        if(uppercase <= lowercase){
            System.out.println(str.toLowerCase());
        }else{
            System.out.println(str.toUpperCase());
        }
        in.close();
    }
}
