public class Casting {
  public static void main(String[] args) {
    int a;
    int b;
    if (args.length != 0) {
      a = (int)Double.parseDouble(args[0]);
      b = (int)Double.parseDouble(args[1]);
    }
    else {
      a = 3;
      b = 4;
    }
    System.out.println(divide(a, b));
  }
  public static double divide(int a, int b) {
    double result = (double)a / b;
    return result;
  }
}
