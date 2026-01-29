public class RationalNumber extends RealNumber {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  When the denominator is negative, negate both numerator and denominator.
  *  This handles all cases including if both are negative.
  *  When the denominator parameter is 0, make the fraction 0/1 regardless of the 
  *  numerator. 
  *  All RationalNumbers must reduce() upon construction.
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno) {
    super(0.0);//this value is ignored!
  }
  
  /**
  *@return the numerator
  */
  public int getNumerator() {
    return numerator;
  }
  /**
  *@return the denominator
  */
  public int getDenominator() {
    return denominator;
  }


  //NOTE! For two reasons, the @Override annotation is useful.
  //1. If the annotated method does not actually override anything, the compiler issues a warning.
  //2. It can help to make the source code more readable.
  
  @Override
  public double getValue() {
    return numerator / denominator;
  }

  /**
  *@return a new RationalNumber that has the same numerator
  *and denominator as this RationalNumber but reversed.
  */
  public RationalNumber reciprocal() {
    return new RationalNumber(denominator, numerator);
  }
  
  /**
  *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
  *note, this is NOT an override. If you use equals on a RealNumber that is the other method.
  */
  public boolean equals(RationalNumber other) {
    return (numerator == other.getNumerator()) && (denominator == other.getDenominator());
  }


  /**
  *@return the value expressed as "3/4" or "8/3", however 4/1 should be "4"
  */
  @Override
  public String toString() {
    if (denominator == 1) {
      return "" + numerator;
    }
    if (denominator == 0) {
      return ""+0;
    }
    return numerator + "/" + denominator;
  }

  /**Calculate the GCD of two integers.
  *@param a the first integers
  *@param b the second integer
  *@return the value of the GCD
  */
  public static int gcd(int a, int b) {
    if (a < b) {
      return gcd(b, a);
    }
    while (a%b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return b;
  }

  /**
  *Divide the numerator and denominator by the GCD
  *This must be used to maintain that all RationalNumbers are
  *reduced upon construction.
  */
  public void reduce() {
    numerator /= gcd(Math.abs(numerator), Math.abs(denominator));
    denominator /= gcd(Math.abs(numerator), Math.abs(denominator));
  }
  
  /******************new math operations Return a new RationalNumber!!!!****************/
  //Note: RealNumber methods are inherited, these are NOT override, they are different methods.
  
  /**
  *@return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other) {
    return new RationalNumber(numerator * other.getNumerator(), denominator * other.getDenominator());
  }

  /**
  *@return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other) {
    return new RationalNumber(numerator * other.getDenominator(), denominator * other.getNumerator());
  }

  /**
  *@return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other) {
    //COMPLETE THIS METHOD
    return null;
  }
  /**
  *@return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other) {
    //COMPLETE THIS METHOD
    return null;
  }
}
