import java.util.*;

public class Driver {  
  public static void main(String[] args){
    int size;
    String algo;
    if (args.length > 2) throw new IllegalArgumentException("Must have at most 2 arguments!");
    if (args.length > 0) {
      size = Integer.parseInt(args[0]);
      if (args.length > 1) {
        algo = args[1];
      }
      else {
        algo = "bubble";
      }
    }
    else {
      size = 10;
      algo = "bubble";
    }
    int[] arr = getRandomArray(size);
    int[] test = arr.clone();
    if (algo.equals("bubble")) {
      System.out.println("bubble");
      //System.out.printf("Unsorted List: %s\n", java.util.Arrays.toString(arr));
      Sorts.bubbleSort(arr);
      Arrays.sort(test);
      //System.out.printf("My Bubble Sort: %s\n", java.util.Arrays.toString(arr));
      //System.out.printf("Java Sort: %s\n", java.util.Arrays.toString(test));
      //System.out.println();
    }
    
    if (algo.equals("selection")) {
      System.out.println("selection");
      //System.out.printf("Unsorted List: %s\n", java.util.Arrays.toString(arr));
      Sorts.selectionSort(arr);
      Arrays.sort(test);
      //System.out.printf("My Selection Sort: %s\n", java.util.Arrays.toString(arr));
      //System.out.printf("Java Sort: %s\n", java.util.Arrays.toString(test));
      //System.out.println();
    }
    if (algo.equals("insertion")){
      System.out.println("insertion");
      //System.out.printf("Unsorted List: %s\n", java.util.Arrays.toString(arr));
      Sorts.insertionSort(arr);
      Arrays.sort(test);
      //System.out.printf("My Insertion Sort: %s\n", java.util.Arrays.toString(arr));
      //System.out.printf("Java Sort: %s\n", java.util.Arrays.toString(test));
      //System.out.println();
    }
  }
  public static int[] getRandomArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < size; i++) {
      arr[i] = (int)(Math.random() * (10001)) - 5000;
      //arr[i] = (int)(Math.random() * (21)) - 10;
    }
    return arr;
  }

}
