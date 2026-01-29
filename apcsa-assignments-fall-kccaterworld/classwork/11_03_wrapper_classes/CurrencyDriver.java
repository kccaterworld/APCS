public class CurrencyDriver {
    public static void main(String[] args) {
        Currency kmoney = new Currency(12.45);
        System.out.println("Value of bankroll: " + kmoney.toString());
        System.out.println("Dollars: " + kmoney.getDollars());
        System.out.println("Cents: " + kmoney.getCents());
        kmoney.setValue(20.56);
        System.out.println("Value of bankroll: " + kmoney.toString());
        System.out.println("Dollars: " + kmoney.getDollars());
        System.out.println("Cents: " + kmoney.getCents());
        kmoney.setValue(67.78);
        System.out.println("Value of bankroll: " + kmoney.toString());
        System.out.println("Dollars: " + kmoney.getDollars());
        System.out.println("Cents: " + kmoney.getCents());
    }
}
