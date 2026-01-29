public class Currency
{
    private Double value;
    
    // Constructor
    public Currency(Double startValue) {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue) {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars() {
        return Integer.valueOf((int) (double) value);
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents() {
        double cents = (int)(value * 100) % 100;
        return (int)cents;
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString() {
        String moneys = "$" + value;
        if ((int)(value * 10) == (value * 10)) moneys += "0";
        return moneys;
    }
}
