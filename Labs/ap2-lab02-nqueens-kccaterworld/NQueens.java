import java.util.Arrays;

public class NQueens{
    private int[][] board;
    private boolean animated = false;
    private int delay;
    
    /*Initialize board with a size by size 2D array. All values should be 0*/
    public NQueens() { this(8); }
    public NQueens(int size){ board = new int[size][size]; }
    public NQueens(int size, int delay) { this(size); setAnimate(true); setDelay(delay); }
    
    public void setAnimate(boolean newAni) { animated = newAni; }
    public void setDelay(int newDel) { delay = newDel; }
    
    /**
    *@return true when the queen added correctly, false Otherwise
    *@precondition r and c are valid indices of the board array
    *@postcondition the board is only changed when the function returns true
    * in which case the queen is added and all it's threatened positions are incremented
    */
    private boolean addQueen(int r, int c){
        if (board[r][c] == 0) {
            board[r][c] = -1;
            for (int i = 1; i < board.length; i++){
                if (c + i < board.length) board[r][c+i]++;
                if (c - i >= 0) board[r][c-i]++;
                if (r + i < board.length) board[r+i][c]++;
                if (r - i >= 0) board[r-i][c]++;
                if (r+i < board.length && c+i < board.length) board[r+i][c+i]++;
                if (r+i < board.length && c-i >= 0) board[r+i][c-i]++;
                if (r-i >= 0 && c+i < board.length) board[r-i][c+i]++;
                if (r-i >= 0 && c-i >= 0) board[r-i][c-i]++;
            }
            if(animated){
                Text.go(1,1);
                System.out.println(this);
                Text.wait(delay);
            }
            return true;
        }
        return false;
    }

    /**Remove the queen that was added to r,c
    *@precondition r and c are valid indices of the board array and there is a queen at position r,c
    *@postcondition the board is modified to remove that queen and all it's
    *threatened positions are decremented
    */
    private void removeQueen(int r, int c){
        if (board[r][c] == -1) {
            board[r][c] = 0;
            for (int i = 1; i < board.length; i++) { // basically copies the code just -- instead of ++
                if (c + i < board.length) board[r][c+i]--;
                if (c - i >= 0) board[r][c-i]--;
                if (r + i < board.length) board[r+i][c]--;
                if (r - i >= 0) board[r-i][c]--;
                if (r+i < board.length && c+i < board.length) board[r+i][c+i]--;
                if (r+i < board.length && c-i >= 0) board[r+i][c-i]--;
                if (r-i >= 0 && c+i < board.length) board[r-i][c+i]--;
                if (r-i >= 0 && c-i >= 0) board[r-i][c-i]--;
            }
            if(animated){
                Text.go(1,1);
                System.out.println(this);
                Text.wait(delay);
            }
        }
    }


    /**Find the first solution configuration possible for this size board. Start by placing
    *  the 1st queen in the top left corner, and each new queen in the next ROW. When backtracking
    *  move the previous queen to the next valid space. This means everyone will generate the same
    *first solution. You must clear the board before attempting to solve.
    *@postcondition: the board remains in a solved state.
    *@return false when the board is not solveable and leaves the board filled with zeros;
    *        returns true when the board is solveable, and leaves the board in a solved state
    */
    public boolean solve() { return solve(0); }
    private boolean solve(int row) {
        if (row == board.length) return true;
        else { for (int i = 0; i < board[row].length; i++) {
            if (addQueen(row, i)) {
                if (solve(row + 1)) return true;
                removeQueen(row, i);
            }
        } }
        return false;
    }

    /**Find all possible solutions to this size board. You must clear the board before attempting to solve.
    *@return the number of solutions found, and leaves the board filled with only 0's
    */
    public int countSolutions() { clear(); return countSolutions(0); }
    private int countSolutions(int row){
        if (row == board.length) return 1;
        int count = 0;
        for (int i = 0; i < board[row].length; i++) {
            if (addQueen(row, i)) {
                count += countSolutions(row + 1);
                removeQueen(row, i);
            }
        }
        return count; 
    }

    /*reset all values of the board to 0. */
    private void clear() { board = new int[board.length][board.length]; }
  
  
    /**
    *@return The output string formatted as follows:
    *All numbers that represent queens are replaced with 'Q'
    *all others are displayed as underscores '_'
    *There are spaces between each symbol:
    _ _ Q _
    Q _ _ _
    _ _ _ Q
    _ Q _ _
    * returned string should look like this:
    * "_ _ Q _\nQ _ _ _\n_ _ _ Q\n_ Q _ _"
    */
    public String toString(){
        String returny = "";
        for (int[] row : board) {
            for (int spot : row) {
                if (spot >= 0) returny += " _ ";
                else returny += " Q ";
            }
            returny += "\n";
       }
        return returny;
    }
}
