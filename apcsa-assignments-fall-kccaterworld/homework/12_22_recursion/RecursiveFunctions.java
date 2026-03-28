public class RecursiveFunctions {
    public static long[] memo = new long[100];
    
    public static void main(String[] args) {
        System.out.println(sumDigits(999999999));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(46));
    }
    //alr lets see if we can beat hudson
    //sorry about my music
    public static int sumDigits(int n) {
        return (n == 0) ? 0 : sumDigits(n/10) + (n%10);
    }
    public static long fibonacci(int n) {
        return memo[n] != 0 ? memo[n] : (memo[n] = (n <= 1) ? n : fibonacci(n-1) + fibonacci(n-2));
    }
}