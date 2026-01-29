public class Driver{

  // Additional methods not shown
  public static double distance(Point a, Point b){
        return Point.distance(a,b);
    }

  public static void main(String[] args){
    
    // Point is a class that represents a 2D coordinate
    Point point1 = new Point(4, 6);
    Point point2 = new Point(2, 8);
    System.out.println(distance(point1, point2));
    System.out.println(Point.distance(point1, point2));
    System.out.println(point1.distanceTo(point2)); 
  }
  
}

/* There are 3 different distance method called in the main method:
*  1. distance(point1, point2)
*  2. Point.distance(point1, point2)
*  3. point1.distanceTo(point2)
*  
*  For each of those methods respond the following questions:
*  1. Where is the method implemented (which class)? Justify your answer.
*   First: Driver, it doesn't have "class.etc"
*   Second: Point, it has "Point.distance"
*   Third: Point, it has "point1.distanceTo" and point1 is a Point object
*  2. Is the method static or non-static? Justify your answer.
*   First: Non-Static, it doesn't need a class or object
*   Second: Static, it is called with the class name "Point.distance", but not an object
*   Third: Non-Static, it is called on the object point1, through the Point class
*/
