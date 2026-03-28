public class Calculator {
    public static void main(String[] args) {
        double num1;
        double num2;
        if (args.length != 0) {
            num1 = Double.parseDouble(args[0]);
            num2 = Double.parseDouble(args[1]);
        } else {
            num1 = 10.0;
            num2 = 12.0;
        }
        double sum = num1 + num2;
        System.out.println((int)num1 + " + " + (int)num2 + " = " + (int)sum);
    }
    
}
