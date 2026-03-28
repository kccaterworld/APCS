public class Strings {
    public static void main(String[] args) {
        printString("Hello");
        System.out.println();
        printReverse("Hello");
        System.out.println();
        System.out.println(countChar("Hello",'l'));
    }
    public static void printString(String word){
        if (word.equals("")) System.out.print("");
        else {
            System.out.print(word.charAt(0));
            printString(word.substring(1));
        }
    }
    public static void printReverse(String word){
        if (word.equals("")) System.out.print("");
        else {
            System.out.print(word.charAt(word.length() - 1));
            printReverse(word.substring(0,word.length() - 1));
        }
    }
    public static int countChar(String word, char ch) {
        if (word.equals("")) return 0;
        if (word.charAt(0) == ch) return 1 + countChar(word.substring(1),ch);
        else return countChar(word.substring(1),ch);
    }
    public static String numberToWords(int number) {
        // 21124
        if (number.length() == 1) return number.charAt(0);
        if (number.length() == 2) return number.charAt(0) + "hundred" + tripToWords(number.substring(1));
        if (number.length() == 3) return number.charAt(0) + "thousand" + tripToWords(number.substring(1));
        else throw new Exception("gng u messed up somewhere");
    }
}
