import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Maze {
    private char[][] maze = new char[0][0]; private boolean animate = false; private int startRow, startCol;

    /*Constructor
    1. Load maze text file,
    2. Sets animate to false by default.
    3. Set startRow and startCol based on the position of the 'S' in the maze file.
    When the file is not found then: throw a FileNotFoundException
    You may assume the file contains a rectangular ascii maze, made with the following 4 characters:
    '#' - Walls - locations that cannot be moved onto
    ' ' - Empty Space - locations that can be moved onto
    'E' - the location of the goal if any (0 or more per file)
    'S' - the location of the start(exactly 1 per file)
    -Make sure your file reading is able to handle this: maze files can have blank
    newlines at the end of the file because some text editors include a newline
    at the end of a file, but that may not be present.*/
    public Maze(String filename) throws FileNotFoundException {
        File fileFile = new File(filename);
        Scanner fileScan = new Scanner(fileFile);
        ArrayList<String> linesArrayList = new ArrayList<>();
        while (fileScan.hasNextLine()) linesArrayList.add(fileScan.nextLine());
        fileScan.close();
        maze = new char[linesArrayList.size()][linesArrayList.get(0).length()];
        for (int i = 0; i < linesArrayList.size(); i++) {
            maze[i] = linesArrayList.get(i).toCharArray();
            for (int j = 0; j < maze[i].length; j++) if (maze[i][j] == 'S') { startRow = i; startCol = j; }
        }
    }
    public Maze(int rows, int cols){
        maze = new char[rows][cols];
        for(char[]row:maze) for(int i = 0; i < row.length;i++) row[i]='#';
        carveMaze(); addSE();
    }


    /*toString
    @Return the string that represents the maze.
    It should look like the text file, 
    some characters will be replaced when you solve the maze.*/
    public String toString() { return Arrays.stream(maze).map(line -> new String(line) + "\n").collect(Collectors.joining()); }

    /*Wrapper Solve Function returns the helper function
    @return the result of the recursive solve.*/
    public int solve() { return solve(startRow, startCol); }
    /*Solve
    @precondition the maze is rectangular and has a border of '#' around the edges.
    @postcondition: The maze has been solved by marking a path of '@' symbols from S to E.
    The 'S' is replaced with '@'
    The 'E' remain the same
    All visited spots that were not part of the solution are changed to '.'
    All visited spots that are part of the solution are changed to '@'
    @return the number of @ symbols from S to E when the maze is solved, or -1 when the maze has no solution.*/
    private int solve(int row, int col) {
        if (maze[row][col] == '#' || maze[row][col] == '@' || maze[row][col] == '.') return -1;
        if (maze[row][col] == 'E') return 0;
        maze[row][col] = '@';
        if (animate) { gotoTop(); clearTerminal(); System.out.printf("%s\n",this); wait(200); }
        int[][] dirs = new int[][] {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int[] dir : dirs) {
            int nextRow = row + dir[0]; int nextCol = col + dir[1];
            int result = solve(nextRow, nextCol);
            if (result >= 0) return result + 1;
        }
        maze[row][col] = '.';
        if (animate) { gotoTop(); clearTerminal(); System.out.printf("%s\n",this); wait(200); }
        return -1;
    }

    /*
     * Second part of this lab:
     * We will go over this method after you write the solve
     */
     public void carveMaze() { carveMaze(1, 1); }
     public void carveMaze(int row, int col) {
        if (row <= 0 || row >= maze.length - 1 || col <= 0 || col >= maze[0].length - 1) return;
        if (maze[row][col] == ' ') return;
        maze[row][col] = ' ';
        if (animate) { gotoTop(); clearTerminal(); System.out.printf("%s\n",this); wait(20); }
        int[][] dirs = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        List<int[]> dirsList = new ArrayList<>(Arrays.asList(dirs));
        Collections.shuffle(dirsList);
        for (int[] dir : dirsList) {
            int newRow = row + dir[0] * 2;
            int newCol = col + dir[1] * 2;
            if (  (newRow > 0) && (newRow < maze.length - 1) && (newCol > 0) && (newCol < maze[0].length - 1) && (maze[newRow][newCol] != ' ')  ) {
                maze[row + dir[0]][col + dir[1]] = ' ';
                if (animate) { gotoTop(); clearTerminal(); System.out.printf("%s\n",this); wait(20); }
                carveMaze(newRow, newCol);
            }
        }
    }
    
    public void addSE() {
        startRow = (int)(Math.random() * (maze.length - 2) + 1); startCol = (int)(Math.random() * (maze[0].length - 2) + 1);
        int eRow = (int)(Math.random() * (maze.length - 2) + 1); int eCol = (int)(Math.random() * (maze[0].length - 2) + 1);
        maze[startRow][startCol] = 'S'; maze[eRow][eCol] = 'E'; return;
    }

    /*
     * The following code will be used for animation.
     * Please do not change anything.
     */

    private void wait(int millis) {
        try { Thread.sleep(millis); }
        catch (InterruptedException e) { e.printStackTrace(); }
    }

    public void setAnimate(boolean b) { animate = b; }
    public static void clearTerminal() { System.out.printf("\033[2J\n"); }
    public static void gotoTop() {  System.out.printf("\033[1;1H\n"); }

}
