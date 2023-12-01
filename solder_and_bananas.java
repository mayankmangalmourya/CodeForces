import java.util.*;

public class solder_and_bananas {

    /*
     * A soldier wants to buy w bananas in the shop. He has to pay k dollars for the
     * first banana, 2k dollars for the second one and so on (in other words, he has
     * to pay i·k dollars for the i-th banana).
     *
     * He has n dollars. How many dollars does he have to borrow from his friend
     * soldier to buy w bananas?
     *
     * Input
     * The first line contains three positive integers k, n, w (1 ≤ k, w ≤ 1000, 0 ≤
     * n ≤ 109), the cost of the first banana, initial number of dollars the soldier
     * has and number of bananas he wants.
     *
     * Output
     * Output one integer — the amount of dollars that the soldier must borrow from
     * his friend. If he doesn't have to borrow money, output 0.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pay_k_dollar = in.nextInt();
        int solder_n_dollar = in.nextInt();
        int total_w = in.nextInt();
        int total = 0;
        for(int i = 1; i <= total_w; i++) {
            total = total + (i*pay_k_dollar);
        }
        if(solder_n_dollar > total){
            System.out.println(0);
        }else{
            System.out.println(total - solder_n_dollar);
        }
        in.close();
    }
}
