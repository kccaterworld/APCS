public class Driver {
    public static void main(String[] args) {
        Shape myShape = new Shape(10, 20);
        Rectangle myRectangle = new Rectangle(10, 20);
        Triangle myTriangle = new Triangle(10, 20);
        System.out.println("Shape height: " + myShape.getHeight() + ", width: " + myShape.getWidth());
        System.out.println("Rectangle area: " + myRectangle.getArea());
        System.out.println("Triangle area: " + myTriangle.getArea());
    }
}
