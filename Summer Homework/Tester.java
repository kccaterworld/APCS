public class Tester {
    //return true if and only if x is prime,false otherwise.
    public static boolean isPrime(int x){
        //just check divisibility for all values from `2` through `x - 1` inclusive.
        //(This is not a good algorithm, just use it)
        for(int i = 2; i < x; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

    //return the nth prime,
    //e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.
    public static int nthPrime(int n){
      //Loop through values and check if they are prime until you find n of them
      //use your isPrime function.
      int[] primesList = new int[n + 1];
      int count = 0;
      for(int i = 0; i <= 1000000; i++) {
        if(isPrime(i) && count <= n) {
            primesList[count] = i;
            count++;
        }
      }
      return primesList[n];
    }
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,50,100,500,1000,10000};
        int[] primes = {2, 3, 5, 7, 11, 229, 541, 3571, 7919, 104729};
        for(int i = 0; i < n.length; i++) {
            if(nthPrime(n[i]) == primes[i]) {
                System.out.println("pass");
            }
            else {
                System.out.println("fail expected " + primes[i] + " but got " + nthPrime(i));
            }
        }
    }
}
