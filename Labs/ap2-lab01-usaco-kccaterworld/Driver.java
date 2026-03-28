public class Driver {
    public static void main(String[] args) {
        long b1 = Bronze.solve("makelake.2.in");
        long b2 = Bronze.solve("makelake.1.in");
        long s1 = Silver.solve("ctravel.1.in");
        long s2 = Silver.solve("ctravel.2.in");
        System.out.printf("Bronze Calculated Solution: %d\tBronze Actual Solution: %d\n", b1, 102762432);
        System.out.printf("Bronze Calculated Solution: %d\tBronze Actual Solution: %d\n", b2, 342144);
        System.out.printf("Silver Calculated Solution: %d\tSilver Actual Solution: %d\n", s1, 1);
        System.out.printf("Silver Calculated Solution: %d\tSilver Actual Solution: %d\n", s2, 74);
    }

}
