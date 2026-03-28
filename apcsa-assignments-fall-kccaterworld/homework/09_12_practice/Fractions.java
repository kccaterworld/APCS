public class Fractions {
  public static void main(String[] args) {
    int num1;
    int den1;
    int num2;
    int den2;
    int numres;

    if (args.length != 0) {
      num1 = (int)Double.parseDouble(args[0]);
      den1 = (int)Double.parseDouble(args[1]);
      num2 = (int)Double.parseDouble(args[2]);
      den2 = (int)Double.parseDouble(args[3]);
    }
    else {
      num1 = 1;
      den1 = 2;
      num2 = 2;
      den2 = 5;
    }

    int denres  = lcm(den1, den2);
    System.out.println(denres);
  }

  public static int lcm(int a, int b) {
    int[] aMults = new int[b];
    int[] bMults = new int[a];
    for(int i = 0; i <= b - 1; i++) {
      aMults[i] = a * i;
    }
    for(int i = 0; i < b; i++) {
      bMults[i] = b * i;
    }
    for(int i = 0; i < aMults.length; i++) {
      for(int j = 0; j < bMults.length; j++) {
        if(aMults[i] == bMults[j]) {
          return aMults[i];
        }
      }
    }
  return 0;
  }
}
