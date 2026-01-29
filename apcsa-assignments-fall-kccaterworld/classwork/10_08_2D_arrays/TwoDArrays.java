public class TwoDArrays{
    public static void main(String[]args){
        int[][] test = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sumMatrix(test, 1));
        System.out.println(sumMatrix(test, 1, 2));
        System.out.println(countZeros(test));
        int[][] zeros = {{0,1,2},{0,3,4},{0,0,0}};
        System.out.println(countZeros(zeros));
        System.out.println(test);
        int[][] test2 = copy(test);
        System.out.println(test2);
        updateLastCol(test2, 0);
        printInt(test2);
        printInt(test);
        System.out.println(htmlTable(test));
    }

    // Method Overloading: The next two methods have the same name and different parameter list
  public static void printInt(int[][] array) {
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + "\t");
      }
      System.out.println();
    }
  }

    // Returns the sum of all elements in a specific row
    public static int sumMatrix(int[][] matrix, int row) {
        int sum = 0;
        for (int val:matrix[row]) sum += val;
        return sum;
    }

    // Returns the sum of all elements between rowStart and rowEnd (inclusive).
    public static int sumMatrix(int[][] matrix, int rowStart, int rowEnd){
         int sum = 0;
         for (int i = rowStart; i <= rowEnd; i++) for (int val:matrix[i]) sum += val;
         return sum;
    }

    // Return how many elements are zero in the 2D array
    public static int countZeros(int[][] nums){
        int count = 0;
        for (int[] row:nums) for (int val:row) if (val==0) count++;
        return count;
    }

    /* The last element in row is incorrect.
       Fix the last column in row as follows:
       If row = 0, last col = number of rows
       If row = 1, last col = total number of elements in the array
       If row = 2, last col = sum of values in first and last rows in the 2D array
       Other rows, last col = 0
       Precondition: arr.length >= 3, row is a valid indix */
     public static void updateLastCol(int[][] arr, int row) {
        if (row == 0) arr[row][arr[row].length - 1] = arr.length;
        if (row == 1) arr[row][arr[row].length - 1] = arr.length * arr[row].length;
        if (row == 2) arr[row][arr[row].length - 1] = sumMatrix(arr, 0) + sumMatrix(arr, arr.length - 1);
        if (row >= 3) arr[row][arr[row].length - 1] = 0;
     }
    
    /* Modify a given 2D array of integer as follows:
       Replace all the negative values:
         - When the row number is the same as the column number replace that negative with the value 1
         - All other negatives replace with 0 */
    public static void replaceNegative(int[][] vals){
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                if (vals[i][j] < 0) {
                    if (i == j) vals[i][j] = 1;
                    if (i != j) vals[i][j] = 0;
                }
            }
        }
    }

    /* Make a copy of the given 2d array.
       When testing : make sure that changing the original does not change the copy.
       DO NOT use any built in methods that copy an array.
       You may write a helper method for this. */
    public static int[][] copy(int[][] nums){
        int[][] copied = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                int val = nums[i][j];
                copied[i][j] = val;
            }
        }
        return copied;
    }


    /* Make an HTML table by putting a table tag around the entire 2d array,
       tr tags around each row, and td tags around each value.
       You may use a helper method
       Note there is no whitespace in the string, it all one line with no spaces/tabs.
       e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
       "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>" */
    public static String htmlTable(int[][]nums){
        String table = "<table>";
        for (int[] row:nums) {
            table += "<tr>";
            for (int val:row) {
                table += "<td>" + val + "</td>";
            }
            table += "</tr>";
        }
        table += "</table>";
        return table;
    }
}
