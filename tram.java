import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        int temp = 0;
        for(int i = 0; i < n; i++){
            int a1 = in.nextInt();
            int b1 = in.nextInt();
            temp = temp - a1;
            temp = temp + b1;
            if(i < n-1){
                total = Math.max(total, temp);
            }
            // System.out.println(total);
        }
        System.out.println(total);
        in.close();
    }
}
