import java.util.Scanner;

public class translation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.next();
        String str2 = in.next();
        String str  = "";
        for(int i = str1.length()-1; i >= 0; i--) {
            str += str1.charAt(i);
        }
        if(str.equals(str2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        in.close();
    }
}
