public class Cylinder extends Circle{
    private double height;
    
    public Cylinder() {
        super();
        height = 0;
    }
    public Cylinder(double rad, double h) {
        super(rad);
        height = h;
    }
    
    public double getHeight() { return height; }
    public double getVolume() { return height * super.getArea(); }
    @Override
    public double getArea() { return (height * (2 * Math.PI * super.getRadius())) + (2 * super.getArea()); }
    
    @Override
    public String toString() {return "Cylinder with height " + height + ", base radius " + super.getRadius() + ", volume " + getVolume() + ", and surface area " + getArea();}    
}
