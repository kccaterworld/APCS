public class Temperature {
    public static void main(String[] args) {
        double tempF = 50.0;
        double tmp = (tempF - 32) * 5 / 9;
        double tempC = Math.round(tmp * 100.0) / 100.0;
        System.out.println(tempF + " degrees Fahrenheit is equal to " + tempC + " degrees Celsius.");
    }
}