import java.util.*;

public class bit_Plus_Plus {
    static Scanner in;

    public static void solve(){
        int t = in.nextInt();
        int result = 0;
        while(t-- != 0){
            String str = in.next();
            if(str.equals("++X")){
                ++result;
            }else if(str.equals("X++")){
                result++;
            }else if(str.equals("--X")){
                --result;
            }else if(str.equals("X--")){
                result--;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        solve();
        in.close();
    }
}
