public class Hanoi {
    public static void main(String[] args) {
        System.out.println("meep");
        mildHanoi(4,'a','c','b');
        int han = medHanoi(4,'a','c','b');
        System.out.printf("%d\n", han);
    }
    
    public static void mildHanoi(int n, char rod_a, char rod_c, char rod_b) {
        if (n==1) System.out.println("Move ring 1 from " + rod_a + " to " + rod_c);
        else {
            mildHanoi(n-1, rod_a, rod_b, rod_c);
            System.out.println("Move ring " + n + " from " + rod_a + " to " + rod_c);
            mildHanoi(n-1, rod_b, rod_c, rod_a);
        }
    }
    
    public static int medHanoi(int n, char rod_a, char rod_c, char rod_b) {
        if (n==1) {
            System.out.println("Move ring 1 from " + rod_a + " to " + rod_c);
            return 1;
        }
        else {
            int i = medHanoi(n-1, rod_a, rod_b, rod_c);
            System.out.println("Move ring " + n + " from " + rod_a + " to " + rod_c);
            return i + 1 + medHanoi(n-1, rod_b, rod_c, rod_a);
        }
    }
}
