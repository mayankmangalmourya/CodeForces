import java.util.*;

public class waterMelon{
    /*
    Two Friends : Pete and Billy decide to buy watermelon they choose biggest and ripest one
    He weight watermelon and get 'w' kilo weight.

    Pete and Billy are great fan of even number.
    then they want to divide the watermelon into two even number. it is not necessary that they
    are equal distribution.

    For sure, each of them should get a part of positive weight.

    Input : w (1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys
    Output : Yes/No - if divide into even otherwise not.

    */

    static Scanner in;
    public static void solve(){
        int i = in.nextInt();
        int remain = i - 2;
        if(remain % 2 == 0 && remain > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        in = new Scanner(System.in);
        solve();
        in.close();
    }
}