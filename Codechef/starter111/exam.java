package Codechef.starter111;
import java.util.*;

public class exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t >= 0) {
            int x_school = in.nextInt();
            int y_student = in.nextInt();
            int z_passed_student = in.nextInt();
            int total = x_school * y_student;
            if(z_passed_student > total/2) {
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            t--;
        }
        in.close();
    }
}
