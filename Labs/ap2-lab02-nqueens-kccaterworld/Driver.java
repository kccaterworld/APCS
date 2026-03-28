import java.util.*;

public class Driver {
    public static void main(String[] args) {
        int size = 8;
        int delayI = 0;
        if (args.length > 0) size = Integer.parseInt(args[0]);
        if (args.length > 1) delayI = Integer.parseInt(args[1]);
        System.out.println("solve");
        NQueens queens = new NQueens(size, delayI);
        if (delayI == 0) queens.setAnimate(false);
        System.out.println(Text.CLEAR_SCREEN);
        System.out.println(Text.HIDE_CURSOR);
        Text.go(1,1);
        queens.solve();
        System.out.println(queens);
        System.out.println(Text.RESET);

        System.out.println("countSolutions");
        queens = new NQueens(size, delayI);
        if (delayI == 0) queens.setAnimate(false);
        System.out.println(Text.CLEAR_SCREEN);
        System.out.println(Text.HIDE_CURSOR);
        Text.go(1,1);
        System.out.println(queens.countSolutions());
        System.out.println(Text.RESET);
    }
}
