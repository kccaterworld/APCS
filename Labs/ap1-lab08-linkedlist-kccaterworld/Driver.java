public class Driver {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        System.out.printf("Initial size: %d\n", list.size());
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.printf("After adding 3 elements: %s\n", list.toString());
        System.out.printf("Size: %d\n", list.size());
        System.out.printf("Reversed: %s\n", list.toStringReversed());
        System.out.printf("Get index 0: %s\n", list.get(0));
        System.out.printf("Get index 1: %s\n", list.get(1));
        System.out.printf("Get index 2: %s\n", list.get(2));
        list.set(1, "blueberry");
        System.out.printf("After set(1, blueberry): %s\n", list.toString());
        System.out.printf("Contains apple: %b\n", list.contains("apple"));
        System.out.printf("Contains grape: %b\n", list.contains("grape"));
        list.add(1, "avocado");
        System.out.printf("After add(1, avocado): %s\n", list.toString());
        System.out.printf("Size after insert: %d\n", list.size());
        String removed = list.remove(2);
        System.out.printf("Removed index 2: %s\n", removed);
        System.out.printf("After remove(2): %s\n", list.toString());
        boolean removedElement = list.remove("apple");
        System.out.printf("Removed apple: %b\n", removedElement);
        System.out.printf("After remove(apple): %s\n", list.toString());
        boolean removedNotFound = list.remove("grape");
        System.out.printf("Removed grape (not found): %b\n", removedNotFound);
        System.out.printf("Final list: %s\n", list.toString());
        System.out.printf("Final size: %d\n", list.size());
        System.out.println("mrep");
    }
}
