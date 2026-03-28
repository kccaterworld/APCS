import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.printf("Ceci n'est pas une pipe\n");

        System.out.printf("\nAnd now, welcoming to the stage, it's DE (String) KWEEE(tet)\n");
        // (String Deque) -> (SD) -> (SD Card) -> (Picard) -> (Jean-Luc Picard) -> (Jean-Luc)
        MyDeque<String> jeanluc = new MyDeque<String>();
        System.out.printf("%s\n", Arrays.toString(jeanluc.getData()));
        System.out.printf("%s\n", jeanluc.toString()); // []
        jeanluc.addFirst("my");
        System.out.printf("%s\n", jeanluc.toString()); // [my]
        jeanluc.addLast("friends");
        System.out.printf("%s\n", jeanluc.toString()); // [my, friends]
        jeanluc.addFirst("hello");
        System.out.printf("%s\n", jeanluc.toString()); // [hello, my, friends]
        jeanluc.removeLast();
        System.out.printf("%s\n", jeanluc.toString()); // [hello, my]
        jeanluc.addLast("dear");
        System.out.printf("%s\n", jeanluc.toString()); // [hello, my, dear]
        jeanluc.addLast("friends!");
        System.out.printf("%s\n", jeanluc.toString()); // [hello, my, dear, friends!]
        System.out.printf("%s\n", Arrays.toString(jeanluc.getData()));

        // (Deque) -> (Deck) -> (Deck of Cards) -> (Joker) -> (Arthur Fleck) -> (Arthur)
        MyDeque<String> arthur = new MyDeque<String>(0);
        System.out.printf("\n%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // []
        arthur.addFirst("Arthur");
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // [Arthur]
        arthur.addLast("Fleck");
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // [Arthur, Fleck
        arthur.addFirst("is");
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // [is, Arthur, Fleck]
        arthur.addFirst("Who");
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // [Who, is, Arthur, Fleck]
        arthur.addLast("!");
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // [Who, is, Arthur, Fleck, !]
        arthur.removeLast();
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // [Who, is, Arthur, Fleck]
        arthur.addLast("?");
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));
        System.out.printf("%s\n", arthur.toString()); // [Who, is, Arthur, Fleck, ?]
        System.out.printf("%s\n", Arrays.toString(arthur.getData()));

        System.out.printf("\nOh yeah and numbers too idk who invited them\n");

        // (Integer Deque) -> (ID) -> (ID Number) -> (PIN) -> (Pins and Needles) -> (Needle)
        MyDeque<Integer> needle = new MyDeque<Integer>();
        System.out.printf("\n%s\n", Arrays.toString(needle.getData()));
        System.out.printf("%s\n", needle.toString()); // []
        needle.addFirst(1);
        System.out.printf("%s\n", needle.toString()); // [1]
        needle.addLast(3);
        System.out.printf("%s\n", needle.toString()); // [1, 3]
        needle.addFirst(2);
        System.out.printf("%s\n", needle.toString()); // [2, 1, 3]
        needle.removeLast();
        System.out.printf("%s\n", needle.toString()); // [2, 1]
        needle.removeFirst();
        System.out.printf("%s\n", needle.toString()); // [1]
        System.out.printf("%s\n", Arrays.toString(needle.getData()));

        // (Needle) -> (Green Needle) -> (Brainstorm) -> (Storm) -> (Thunder)
        MyDeque<Integer> thunder = new MyDeque<Integer>(1);
        System.out.printf("\n%s\n", Arrays.toString(thunder.getData()));
        System.out.printf("%s\n", thunder.toString()); // []
        thunder.addFirst(1);
        System.out.printf("%s\n", Arrays.toString(thunder.getData()));
        System.out.printf("%s\n", thunder.toString()); // [1]
        thunder.addLast(2);
        System.out.printf("%s\n", Arrays.toString(thunder.getData()));
        System.out.printf("%s\n", thunder.toString()); // [1, 2]
        thunder.addFirst(3);
        System.out.printf("%s\n", Arrays.toString(thunder.getData()));
        System.out.printf("%s\n", thunder.toString()); // [3, 1, 2]

        // (Deque) -> (Deck) -> (Deck of Cards) -> (Casino) -> (Las Vegas)
        MyDeque<Object> vegas = new MyDeque<Object>(5);
        try { vegas.addFirst(null); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        try { vegas.removeFirst(); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        try { vegas.removeLast(); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        try { vegas.getFirst(); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        try { vegas.getLast(); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        try { vegas.getStart(); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        try { vegas.getEnd(); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        try { vegas.getData(); } catch (Exception e) { System.out.printf("\t%s\n", e.getMessage()); }
        vegas.addFirst(1);
        System.out.printf("\n%s\n", vegas.toString()); // [1]
        vegas.addLast("WOWZA");
        System.out.printf("%s\n", vegas.toString()); // [1, WOWZA]
        vegas.addFirst(3.14);
        System.out.printf("%s\n", vegas.toString()); // [3.14, 1, WOWZA]
        vegas.addLast(thunder);
        System.out.printf("%s\n", vegas.toString()); // [3.14, 1, WOWZA, [3, 1, 2]]
        vegas.addFirst(new MyDeque<Object>(vegas.getData(), vegas.getStart(), vegas.getEnd()));
        System.out.printf("%s\n", vegas.toString()); // [[...], 3.14, 1, WOWZA, [3, 1, 2]]

        System.out.printf("\nCall it a stack the way it's a deuqe\n");
        System.out.printf("C'est magique\n");
    }
}
