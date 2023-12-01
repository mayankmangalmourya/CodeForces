public class fibo {
    public static void main(String[] args) {
        long val1 = 0;
        long val2 = 1;
        System.out.print(val1 +" "+val2+" ");
        for(long i = 3; i <= 100; i++){
            long next_fibo = val1 + val2;
            val1 = val2;
            val2 = next_fibo;
            System.out.print(next_fibo+" ");
        }
    }
}
