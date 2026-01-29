public class Circle {
    private double radius;
    
    public Circle() { this(0); }
    public Circle(double rad) { radius = rad; }
    
    public double getRadius() { return radius; }
    public double getArea() { return Math.pow(radius,2.0) * Math.PI;  }
    
    public String toString() { return "This is a circle with radius " + radius + " and area " + getArea(); }
}
