import java.util.*;

public class Calculator {
    public static double eval(String expression) {
        String[] exprStr = expression.split(" ");
        ArrayDeque<Double> expr = new ArrayDeque<Double>();
        for (int i = 0; i < exprStr.length; i++) {
            double current;
            try { current = Double.parseDouble(exprStr[i]); }
            catch (Exception e) {
                try { expr.addFirst(simplify(expr.removeFirst(), expr.removeFirst(), exprStr[i])); }
                catch (IllegalArgumentException ia) { throw ia; }
                catch (Exception ex) { throw new IllegalArgumentException("Too many operators"); }
                continue;
            }
            expr.addFirst(current);
        }
        if (expr.size() != 1) throw new IllegalArgumentException("Too many operands");
        return expr.removeFirst();
    }
    
    public static double simplify(double a, double b, String op) {
        switch (op) {
            case "+": return b + a;
            case "-": return b - a;
            case "*": return b * a;
            case "/": if (a == 0) throw new IllegalArgumentException("Cannot divide by zero"); return b / a;
            case "%": if (a == 0) throw new IllegalArgumentException("Cannot divide by zero"); return b % a;
        }
        throw new IllegalArgumentException("Invalid operator");
    }
    
    public static String infixToPostfix(String infix) {
        String postfix = "";
        ArrayList<String> ops = new ArrayList<String>(Arrays.asList(new String[] {"+","-","*","/","%", "(", ")"}));
        int[] weights =  new int[] {0,0,1,1,1,2,2}; // Indexes of each weight matches to the index of the corresponding operator in ops
        ArrayDeque<String> operators = new ArrayDeque<String>();
        String[] infixstrarr = infix.split("");
        for (int i = 0; i < infixstrarr.length; i++) {
            if (infixstrarr[i].equals(" ")) continue;
            String current = infixstrarr[i];
            if (ops.contains(current)) {
                if (current.equals("(")) {
                    operators.push(current);
                    continue;
                }
                if (current.equals(")")) {
                    while (!operators.isEmpty() && !operators.getFirst().equals("(")) postfix += " " + operators.pop();
                    if (operators.isEmpty()) throw new IllegalArgumentException("Mismatched parentheses");
                    operators.pop(); continue;
                }
                while (!operators.isEmpty() && !operators.getFirst().equals("(")&&
                        weights[ops.indexOf(operators.getFirst())] >= weights[ops.indexOf(current)])
                    postfix += " " + operators.pop();
                operators.push(current);
            }
            else postfix += " " + current;
        }
        while (!operators.isEmpty()) postfix += " " + operators.pop();
        return postfix.trim();
    }
}
