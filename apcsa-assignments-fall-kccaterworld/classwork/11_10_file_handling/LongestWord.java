import java.util.*;
import java.io.*;

public class LongestWord {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<String>();
        try {
            File myText = new File("my_text.txt");
            Scanner input = new Scanner(myText);
            while (input.hasNext()) {
                words.add(input.next());
            }
            input.close();
            String longestWordie = "";
            for (String word:words) {
                if (word.length() > longestWordie.length()) longestWordie = word;
            }
            System.out.println(longestWordie);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(words);
    }
}
