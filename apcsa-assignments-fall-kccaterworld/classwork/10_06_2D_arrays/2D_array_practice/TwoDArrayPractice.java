public class TwoDArrayPractice
{

  public static void main(String[] args)
    {
      // Create test cases here.
      
      // Print the status of your 2D array before and after
      // invoking a method. You will need to add a print() method
      // to avoid duplicated code in your main.
      int[][] test = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
      };
      printInt(test);
      rowSwap(test, 0, 2);
      printInt(test);
      colSwap(test, 0, 2);
      printInt(test);
      printStr(fillRows("Happy Halloween", 3, 4));
      printStr(fillRows("Hello", 3, 4));
    }

  public static void printStr(String[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }

  public static void printInt(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }

  
    /*
     * Swaps all values in the specified 2 rows of array.
    */
  public static void rowSwap(int[][] array, int rowAIndex, int rowBIndex)
    {
        int[] temp = array[rowAIndex];
        array[rowAIndex] = array[rowBIndex];
        array[rowBIndex] = temp;
    }

  
    /**
     * Swaps all values in the specified 2 columns of array.
     */
    public static void colSwap(int[][] array, int colAIndex, int colBIndex)
    {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][colAIndex];
            array[i][colAIndex] = array[i][colBIndex];
            array[i][colBIndex] = temp;
        }
    }

  
    /*
     * Returns an array with the specified number of rows and columns
     * containing the characters from str in row-major order. If str.length()
     * is greater than rows * cols, extra characters are ignored. If
     * str.length() is less than rows * cols, the remaining elements in the
     * returned array contain null.

     Examples:

      String[][] result = fillRows("Happy Halloween", 3, 4);
      
      result (after method call):
      "H"     "a"     "p"     "p"
      "y"     " "     "H"     "a"
      "l"     "l"     "o"     "w"
      
      
      String[][] result = fillRows("hello", 3, 4);
      
      result (after method call):
      "h"     "e"     "l"     "l"
      "o"     null    null    null
      null    null    null    null

     */
    public static String[][] fillRows(String str, int rows, int cols)
    {
        if (str.length() > (rows * cols)) str = str.substring(0,rows*cols);
        String[][] filled = new String[rows][cols];
        int count = 0;
        for (int i = 0; i < filled.length; i++) {
          for (int j = 0; j < filled[i].length; j++) {
            String loc = "";
            loc += str.charAt(count);
            filled[i][j] = loc;
            if (count == str.length()-1) return filled;
            count++;
          }
        }
        return filled; // replace this with your 2D array
    }
  
}    
