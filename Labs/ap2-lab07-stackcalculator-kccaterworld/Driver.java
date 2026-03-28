public class Driver {
    public static void main(String[] args) {
        System.out.printf("%.1f\n", Calculator.eval("4 2 %"));
        System.out.printf("%.1f\n", Calculator.eval(Calculator.infixToPostfix("((9 - 1) % 3 ) * ((4 + 1) / 2)"))); 
    }
}
