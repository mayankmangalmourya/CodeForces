import java.util.*;

public class team {

    /*
    Three friend petya, vasya and tonya participated in contest.
    if any two of them know how to solve problem then they can solve problem and counted score as 1.
    This contest offers n problems to the participants. For each problem we know,
    which friend is sure about the solution. Help the friends find the number of problems
    for which they will write a solution.

    Input : The first input line contains a single integer n (1 ≤ n ≤ 1000) —
    the number of problems in the contest.
    Then n lines contain three integers each,
    each integer is either 0 or 1.
    If the first number in the line equals 1, then Petya is sure about the problem's solution,
    otherwise he isn't sure.
    The second number shows Vasya's view on the solution,
    the third number shows Tonya's view. The numbers on the lines are separated by spaces.
    
    Output : Print a single integer — the number of problems the friends will implement on the contest.

    */

    static Scanner in;

    public static void solve() {
        int n = in.nextInt();
        int result = 0;
        for(int i = 0; i < n; i++) {
            int petya = in.nextInt();
            int vasya = in.nextInt();
            int tonya = in.nextInt();
            if(petya == 1 && vasya == 1 || petya == 1 && tonya == 1 || vasya == 1 && tonya == 1) {
                result += 1;
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
