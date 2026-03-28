public class Driver {
    public static void main(String[] args) {
        SuperArray s1 = new SuperArray();
        System.out.println(s1.size());
        SuperArray s2 = new SuperArray(5);
        s2.add("one");
        System.out.println(s2.size());
        System.out.println(s2.get(0));
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");
        System.out.println(s1.size());
        System.out.println(s1.get(2));
        System.out.println(s1.set(2,"X"));
        System.out.println(s1.get(2));
        System.out.println(s1.indexOf("A"));
        System.out.println(s1.lastIndexOf("A"));
        System.out.println(s1.remove(1));
        s1.add("A");
        System.out.println(s1.indexOf("A"));
        System.out.println(s1.lastIndexOf("A"));
        System.out.println(s1.remove("A"));
        System.out.println(s1.indexOf("A"));
        System.out.println(s1.toString());
        System.out.println("Here?");
        try {
            System.out.println(s1.get(-1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        try {
            System.out.println(s1.set(100,"Y"));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.println(s1.lastIndexOf("Z"));
        System.out.println(s1.remove(null));
        SuperArray s3 = new SuperArray();
        for (int i = 0; i < 10; i++) s3.add("v" + i);
        System.out.println(s3.size());
        System.out.println(s3.get(9));
        System.out.println(s3.toString());
        System.out.println(s3.add("a"));
        s3.add(2,"a");
        System.out.println(s3.toString());

    }
}
