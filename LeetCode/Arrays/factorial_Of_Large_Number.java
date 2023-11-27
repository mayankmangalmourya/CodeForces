package LeetCode.Arrays;
import java.util.*;

public class factorial_Of_Large_Number {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + getFactorial(n));
    }

    private static List<Integer> getFactorial(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        for(int i = 2; i <= n; i++){
            multiply(result, i);
        }
        Collections.reverse(result);
        return result;
    }

    private static void multiply(List<Integer> result, int multiplier) {
        int carry = 0;
        for(int i = 0; i < result.size(); i++) {
            int product = result.get(i) * multiplier + carry;
            result.set(i, product%10);
            carry = product/10;
        }
        while (carry > 0) {
            result.add(carry%10);
            carry = carry / 10;
        }
    }
}
