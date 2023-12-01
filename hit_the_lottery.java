import java.util.Scanner;

public class hit_the_lottery {

    public static void solve(int n, int idx) {
        int result = 0;
        while (n > 0) {
            if (n >= 100) {
                n -= 100;
                result++;
                if (n < 100) {
                    idx--;
                }
            } else if (n >= 20) {
                n -= 20;
                result++;
                if (n < 20) {
                    idx--;
                }
            } else if (n >= 10) {
                n -= 10;
                result++;
                if (n < 10) {
                    idx--;
                }
            } else if (n >= 5) {
                n -= 5;
                result++;
                if (n < 5) {
                    idx--;
                }
            } else {
                n -= 1;
                result++;
                if (n < 1) {
                    idx--;
                }
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int idx = 4;
        solve(n, idx);
        in.close();
    }
}
