public class longest_Consecutive_Repetition {
    public static void solve(String str){
        int n = str.length();
        if (n == 0) {
            System.out.println("('', 0)");
            return;
        }
        int ptr = n-1;
        char current_char = str.charAt(ptr);
        int count = 0;
        int result = Integer.MIN_VALUE;
        char result_char = '#';
        while(ptr >= 0){
            while(ptr >= 0 && str.charAt(ptr) == current_char){
                count++;
                ptr--;
            }
            if(count >= result){
                result = count;
                result_char = current_char;
            }
            if(ptr >= 0){
                current_char = str.charAt(ptr);
            }
            count = 0;
        }
        System.out.println("("+result_char +", "+result+")");
    }

    // ----------------- Recursion Solution -------------------//
    static int result = Integer.MIN_VALUE;
    static char result_char = '#';
    public static void recursion(String str, int ptr){
        if(ptr < 0){
            System.out.println("("+result_char +", "+result+")");
            return;
        }
        char current_char = str.charAt(ptr);
        int count_char = 0;
        int i = ptr;
        for(i = ptr; i >= 0 && str.charAt(ptr) == current_char; i--){
            count_char++;
        }
        // while(ptr >= 0 && str.charAt(ptr) == current_char){
        //     count_char++;
        //     ptr--;
        // }
        if(count_char >= result){
            result = count_char;
            result_char = current_char;
        }
        // recursion call.....
        recursion(str, i);
    }
    public static void main(String[] args) {
        String str = "";
        solve(str);

        // ------------------- with recursion. -----------------------
        // if(str.length() == 0){
        //     System.out.println("('', 0)");
        // }else{
        //     recursion(str, str.length()-1);
        // }
    }
}
