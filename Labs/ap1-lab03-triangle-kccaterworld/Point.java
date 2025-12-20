public class Point{
  private double x,y;

  /*Return a string in the format: (x, y)
  *where x and y are the values from the Point.
  *e.g.  "(0.0, 1.23)"  or  "(-1.02, 21.45)"
  */
  public String toString() {return "(" + x + ", " + y + ")";}
  
  public static double distance(Point a, Point b){return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));}

  public double distanceTo(Point other){return distance(this, other);}
  
  
  //#####################################
  //STOP! DO NOT DO THIS PARTS UNTIL YOU ARE TOLD TO DO SO
  //####################################
  public static boolean closeEnough(double a, double b){
    if (a == b) return true;
    return Math.abs(a-b) < 0.001 * Math.min(Math.abs(a), Math.abs(b));
  }
  
  /*Return true when the respective x and y values of the two points differ by at most 0.001% each.
  *To avoid issues: If one is 0.0, the other must be exactly 0.0.
  */
  public boolean equals(Point other){
    //You write this later
    return closeEnough(other.x, x) && closeEnough(other.y, y);
  }

  //#####################################
  //DO NOT EDIT BELOW THIS LINE:
  //#####################################
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }
}
