public class Shape {
    private double height, width;

    public Shape() { this(0,0); }
    public Shape(double h, double w) {
        height = h;
        width = w;
    }

    public double getHeight() { return height; }
    public double getWidth() { return width; }
    public void setHeight(double newHeight) { height = newHeight; }
    public void setWidth(double newWidth) { width = newWidth; }
}
