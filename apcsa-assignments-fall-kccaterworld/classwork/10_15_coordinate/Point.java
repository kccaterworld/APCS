public class Point{
    private double[] coordinates;
    private String label = "";
    private static int counter = 0;
    private static int alive = 0;
    
    public Point() {this(0,0,"");}
    public Point(double x, double y) {this(x,y,"");}
    public Point(Point point) {this(point.getXCoord(), point.getYCoord(), "");}
    public Point(double x, double y, String label) {
        this.label = label;
        coordinates = new double[2];
        coordinates[0] = x;
        coordinates[1] = y;
        counter++;
        alive++;
    }
    
    public double getXCoord() {return coordinates[0];}
    public double getYCoord() {return coordinates[1];}
    public String getLabel() {return label;}
    
    public static int getCount() {return counter;}
    public static int getAlive() {return alive;}
    public static int getDead() {return counter - alive;}
    
    public void deletePoint() {coordinates = null; alive--;}
    public static void deletePoint(Point point) {point.deletePoint();}
    public void deleteLabel() {label = null;}
    public static void deleteLabel(Point point) {point.deleteLabel();}

    public double distanceTo(Point point) {return Math.sqrt(Math.pow(this.getXCoord() - point.getXCoord(), 2) + Math.pow(this.getYCoord() - point.getYCoord(), 2));}
    public static double distance(Point point1, Point point2) {return Math.sqrt(Math.pow(point1.getXCoord() - point2.getXCoord(), 2) + Math.pow(point1.getYCoord() - point2.getYCoord(), 2));}
}
