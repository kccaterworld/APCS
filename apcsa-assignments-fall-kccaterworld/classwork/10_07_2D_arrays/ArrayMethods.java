public class ArrayMethods {
    public static void main(String[] args) {
      int[][] array2d = {{8, 4, 2}, {1, 0, 9}, {5, 7, 8}};
      print(array2d);
      System.out.println(findSum(array2d));
      print(transpose(array2d));
    }
    
    
    public static void print(int[][] array) {
      System.out.print("[");
      for (int i = 0; i < array.length; i++) {
        System.out.print("[");
        for (int j = 0; j < array[i].length; j++) {
          System.out.print(array[i][j]);
          if (j < array[i].length - 1) System.out.print(", ");
        }
        System.out.print("]");
        if (i < array.length - 1) System.out.print(", ");
      }
      System.out.println("]");
    }
  
    public static int findSum(int[][] array) {
      int sum = 0;
      for (int[] row:array) for (int val:row) sum += val;
      return sum;
    }
        

    public static int[][] transpose(int[][] array) {
      int[][] transposed = new int[array[0].length][array.length];
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
          transposed[j][i] = array[i][j];
        }
      }
      return transposed;
    } 
  
}
