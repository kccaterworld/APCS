public class Triangle{
  //Instance Variables
  private Point v1;
  private Point v2;
  private Point v0;
  //Constructors
  public Triangle(double x0, double y0, double x1, double y1, double x2, double y2) {
    this(new Point(x0,y0), new Point(x1,y1), new Point(x2,y2));
  }
  public Triangle(Point v0, Point v1, Point v2) {
    this.v0 = new Point(v0);
    this.v1 = new Point(v1);
    this.v2 = new Point(v2);
  }
  //Methods
  public Point getVertex(int v) {
    if (v==0) return v0;
    if (v==1) return v1;
    if (v==2) return v2;
    if (0 < v || v > 2) throw new IllegalArgumentException("Vertex must be 0, 1, or 2");
    return null;
  }
  public String toString() {
    return "{" + v0.toString() + ", " + v1.toString() + ", " + v2.toString() + "}";
  }
  public double getPerimeter() {
    return Point.distance(v0, v1) + Point.distance(v1, v2) + Point.distance(v2, v0);
  }
  
  public void setVertex(int v, Point p) {
    if (v==0) v0 = new Point(p);
    if (v==1) v1 = new Point(p);
    if (v==2) v2 = new Point(p);
  }
  
  public boolean equals(Triangle other) {
    return v0.equals(other.v0) && v1.equals(other.v1) && v2.equals(other.v2);
  }
  public String getTriangleType(){
    double distA = Point.distance(v0, v1);
    double distB = Point.distance(v1, v2);
    double distC = Point.distance(v2, v0);
    if (distA == distB && distB == distC) return "equilateral";
    else if (distA == distB || distB == distC || distA == distC) return "isosceles";
    else return "scalene";
  }
  public double getArea(){
    double s = (Point.distance(v0, v1) + Point.distance(v1, v2) + Point.distance(v2, v0)) / 2.0;
    double area = s * (s - Point.distance(v0, v1)) * (s - Point.distance(v1, v2)) * (s - Point.distance(v2, v0));
    if (area <= 0.0) return 0.0;
    return Math.sqrt(area);
  }
}
