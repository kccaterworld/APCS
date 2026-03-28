public class Driver {
    public static void main(String[] args) {
        Circle myCirc0 = new Circle();
        Circle myCirc9 = new Circle(9);
        
        Cylinder myCyl0000 = new Cylinder();
        Cylinder myCyl1020 = new Cylinder(10, 20);
        
        System.out.println(myCirc0);
        System.out.println(myCirc0.getArea());
        System.out.println(myCirc0.getRadius());
        System.out.println(myCirc9);
        System.out.println(myCirc9.getArea());
        System.out.println(myCirc9.getRadius());
        System.out.println(myCyl0000);
        System.out.println(myCyl0000.getRadius());
        System.out.println(myCyl0000.getHeight());
        System.out.println(myCyl0000.getVolume());
        System.out.println(myCyl0000.getArea());
        System.out.println(myCyl1020);
        System.out.println(myCyl1020.getRadius());
        System.out.println(myCyl1020.getHeight());
        System.out.println(myCyl1020.getVolume());
        System.out.println(myCyl1020.getArea());
    }
}
