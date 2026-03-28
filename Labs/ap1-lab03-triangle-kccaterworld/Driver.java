public class Driver{
  public static void main(String[]args){
    Point r = new Point(100,100);
    Point p = new Point(3.0,4.0);
    Point q = new Point(0.0,0.0);
    System.out.println(p+" should be (3.0, 4.0)");
    System.out.println(r.distance(p,q)+" should be 5.0");
    p = new Point(3.0,4.0);
    q = new Point(4.0,5.0);
    System.out.println(p.distanceTo(q)+" should be 1.4142...");
    System.out.println(false && false);
    Triangle t1 = new Triangle(new Point(0,0), new Point(1,0), new Point(0,1));
    System.out.println(t1.getPerimeter()+" should be 3.4142...");
    System.out.println(t1.getArea()+" should be 0.5");
    System.out.println(t1.getTriangleType()+" should be isosceles");
    Triangle t2 = new Triangle(new Point(0,0), new Point(3,0), new Point(0,4));
    System.out.println(t2.getPerimeter()+" should be 12.0");
    System.out.println(t2.getArea()+" should be 6.0");
    System.out.println(new Point(0.0,0.0).distanceTo(new Point(0.0,0.0))+" should be 0.0");
    System.out.println(new Point(0.0,0.0).equals(new Point(0.0,0.0))+" should be true");
    System.out.println(new Point(0.0,0.0).equals(new Point(1e-12,0.0))+" should be false");
    System.out.println(new Point(1000000000.0,1000000000.0).equals(new Point(1000000500.0,1000000500.0))+" should be true");
    Triangle t3 = new Triangle(new Point(1,1), new Point(1,1), new Point(1,1));
    System.out.println(t3.getPerimeter()+" should be 0.0");
    System.out.println(t3.getArea()+" should be 0.0");
    System.out.println(t3.getTriangleType()+" should be equilateral");
    Triangle t4 = new Triangle(new Point(0,0), new Point(1,1), new Point(2,2));
    System.out.println(t4.getPerimeter()+" should be 5.6568...");
    System.out.println(t4.getArea()+" should be 0.0");
    System.out.println(t4.getTriangleType()+" should be isosceles");
    System.out.println(t2.getVertex(0)+" should be (0.0, 0.0)");
    Triangle t5 = new Triangle(new Point(-1,-1), new Point(-2,-3), new Point(4,5));
    System.out.println(t5.getPerimeter()+" should be 20.0463...");
    System.out.println(t5.getArea()+" should be 2.0");
  }
}
