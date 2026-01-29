import java.util.*;
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            ArrayList<String> lines = new ArrayList<String>();
            File twod = new File("2d.txt");
            Scanner input = new Scanner(twod);
            while (input.hasNextLine()) {
                lines.add(input.nextLine());
            }
            // put stuff here
            String[][] linesList = new String[lines.size()][];
            for (int i = 0; i < lines.size(); i++) {
                linesList[i] = lines.get(i).split(" ");
            }
            System.out.println(Arrays.deepToString(linesList));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
