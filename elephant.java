import java.util.*;

public class elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        while(n != 0){
            if(n >= 5){
                n -= 5;
                res++;
            }else if(n >= 4){
                n -= 4;
                res++;
            }else if(n >= 3){
                n -= 3;
                res++;
            }else if(n >= 2){
                n -= 2;
                res++;
            }else{
                n -= 1;
                res++;
            }
        }
        System.out.println(res);
        sc.close();
    }
}
