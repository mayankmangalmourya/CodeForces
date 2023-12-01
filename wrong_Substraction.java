import java.util.*;

public class wrong_Substraction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int rem = n % 10;
            if(rem == 0){
                n = n / 10;
            }else{
                n = n-1;
            }
        }
        System.out.println(n);
        in.close();
    }
}
