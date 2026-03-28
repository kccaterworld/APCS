public class Rectangle extends Shape{
    public Rectangle() { super(); }
    public Rectangle(double h, double w) { super(h, w); }

    public double getArea() {return getHeight() * getWidth(); }
}
