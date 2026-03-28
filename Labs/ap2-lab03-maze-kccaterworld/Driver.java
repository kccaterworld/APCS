import java.io.FileNotFoundException;

public class Driver{
    public static void main(String[]args){
        String filename = "files/maze1";
        if (args.length > 0) filename = args[0]; if (!filename.startsWith("files/")) filename = "files/" + filename;
        try {
            Maze m = new Maze(filename); m.setAnimate(true);
            System.out.printf("Number of steps from S to E: %d\n%s\n", m.solve(),m);
        } catch(FileNotFoundException e) { System.out.printf("File not found: %s\n", filename); }
        Maze m2 = new Maze(9, 9); m2.setAnimate(true);
        System.out.println(m2); m2.solve();
    }
}
