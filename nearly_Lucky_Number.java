import java.util.*;

public class nearly_Lucky_Number {
    public static void solve(long n){
        boolean result = true;
        while(n > 0){
            long rem = n % 10;
            if(rem == 7 || rem == 4){
                n /= 10;
            }else{
                result = false;
                break;
            }
        }
        if(result){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        solve(n);
        in.close();
    }
}
