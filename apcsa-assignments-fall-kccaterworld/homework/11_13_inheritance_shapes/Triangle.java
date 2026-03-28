public class Triangle extends Shape {
    public Triangle() { super(); }
    public Triangle(double h, double w) { super(h, w); }

    public double getArea() {return (getHeight() * getWidth()) / 2; }
}
