import java.util.*;
import java.io.*;

public class Advent {
    public static void main(String[] args) {
        System.out.println("\nAdvent of Code 2016");
        System.out.printf("Day 1: %d\n", day1());
        System.out.printf("Day 2: %s\n", day2());
        System.out.printf("Day 3: %s\n", day3());
        System.out.printf("Day 6: %s\n", day6());
        
        System.out.println();
    }
    public static int day1(){
        // Part 1
        try{
            File iFile = new File("day1.txt");
            Scanner input = new Scanner(iFile);
            int xDist = 0;
            int yDist = 0;
            int dir = 0;
            int linenum = 0;
            ArrayList<String> dirList = new ArrayList<String>();
            while (input.hasNext()) {
                linenum++;
                String inLine = input.next();
                String line = inLine.substring(0,inLine.length() - 1);
                if (line.substring(0,1).equals("L")) dir++;
                if (line.substring(0,1).equals("R")) dir+=3;
                dir = dir%4;
                int dist = Integer.parseInt(line.substring(1));
                if ((dir == 0)) yDist += dist;
                if ((dir == 2)) yDist -= dist;
                if ((dir == 1)) xDist -= dist;
                if ((dir == 3)) xDist += dist;
                //System.out.printf("Line#: %d %s, dir: %d, dist: %d, xDist: %d, yDist: %d,\n", linenum, line, dir, dist, xDist, yDist);
            }
            input.close();
            
            
            return Math.abs(xDist) + Math.abs(yDist);
        }
        catch (IOException e) { e.printStackTrace(); }
        
        return -1;
    }

    public static String day2(){
        String code = "";

        try{
            File iFile = new File("day2.txt");
            Scanner input = new Scanner(iFile);
            ArrayList<String> lines = new ArrayList<String>();
            String[][] keypad = {{"1","2","3"}, {"4","5","6"}, {"7","8","9"}};
            while (input.hasNextLine()) lines.add(input.nextLine());
            input.close();
            int row = 1;
            int coll = 1;
            int count = 0;
            for (String line : lines) {
                for (int j = 0; j < line.length(); j++) {
                    count++;
                    if (line.charAt(j) == 'U') row++;
                    if (line.charAt(j) == 'D') row--;
                    if (line.charAt(j) == 'R') coll++;
                    if (line.charAt(j) == 'L') coll--;
                    //System.out.printf("Move# %d: %c, row: %d, coll: %d\n", count, line.charAt(j), row, coll);
                    if (row < 0) row = 0;
                    if (row > 2) row = 2;
                    if (coll < 0) coll = 0;
                    if (coll > 2) coll = 2;
                    //System.out.printf("Move# %d: %c, row: %d, coll: %d\n\n", count, line.charAt(j), row, coll);
                }
                code += keypad[2-row][coll];
            }
        }
        catch (IOException e) { e.printStackTrace(); }

        return code;
    }

    public static int day3(){
        try{
            File iFile = new File("day3.txt");
            Scanner input = new Scanner(iFile);
            ArrayList<String> lines = new ArrayList<String>();
            int countYes = 0;
            while (input.hasNextLine()) lines.add(input.nextLine());
            input.close();
            for (String line : lines) {
                String[] linList = line.split("\\s+");
                int[] sides = new int[3];
                for (int i = 1; i < linList.length; i++) {
                    sides[i-1] = Integer.parseInt(linList[i]);
                }
                if ( (sides[0] + sides[1] > sides[2]) && (sides[2] + sides[1] > sides[0]) && (sides[0] + sides[2] > sides[1]) ) {
                    countYes++;
                }
                //System.out.println(Arrays.toString(sides));
            }
            return countYes;
        }
        catch (IOException e) { e.printStackTrace(); }
        return -1;
    }

    public static String day6(){
        String result = "";
        try{
            File iFile = new File("day6.txt");
            Scanner input = new Scanner(iFile);
            ArrayList<String> lines = new ArrayList<String>();
            while (input.hasNextLine()) lines.add(input.nextLine());
            for (int i = 0; i < lines.get(0).length(); i++) {
                int[] letterCount = new int[26];
                for (String line : lines) {
                    char c = line.charAt(i);
                    letterCount[c - 'a']++;
                }
                int maxCount = 0;
                char maxChar = 'a';
                for (int j = 0; j < letterCount.length; j++) {
                    if (letterCount[j] > maxCount) {
                        maxCount = letterCount[j];
                        maxChar = (char) (j + 'a');
                    }
                }
                result += maxChar;
            }
            return result;
        }
        catch (IOException e) { e.printStackTrace(); }
        return result;
    }

    public static Object dayTemplate(){
        try{
            File iFile = new File("day#.txt"); // Replace # with day number
            Scanner input = new Scanner(iFile);
            ArrayList<String> lines = new ArrayList<String>(); // Change lines to whatever u split by
            while (input.hasNextLine()) lines.add(input.nextLine()); // maybe next instead idc
            input.close();
            return null; //change return type to T
        }
        catch (IOException e) { e.printStackTrace(); }
        return null;  //change return type to T
    }
}
