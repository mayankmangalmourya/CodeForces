import java.util.Scanner;

public class petya_And_String {
    static Scanner in;

    public static void solve(){
        String str1 = in.next();
        str1 = str1.toLowerCase();
        String str2 = in.next();
        str2 = str2.toLowerCase();
        int compare = str1.compareTo(str2);
        if(compare == 0){
            System.out.println(0);
        }else{
            for (int i=0;i<str1.length() && i<str2.length();i++){
                if(str1.charAt(i) == str2.charAt(i)){
                    continue;
                }
                else if(str1.charAt(i)  < str2.charAt(i)){
                    System.out.print(-1);
                    break;
                }else{
                    System.out.print(1);
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        solve();
        in.close();
    }
}
