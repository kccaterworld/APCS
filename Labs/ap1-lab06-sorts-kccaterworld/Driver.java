import java.util.*;

public class Driver {  
  public static void main(String[] args){
    int[] arr0 = getRandomArray(10);
    int[] arr1 = getRandomArray(10);
    int[] arr2 = getRandomArray(10);
    
    int[] test0 = arr0.clone();
    int[] test1 = arr1.clone();
    int[] test2 = arr2.clone();
    
    System.out.printf("Unsorted List: %s\n", java.util.Arrays.toString(arr0));
    NuSorts.bubbleSort(arr0);
    Arrays.sort(test0);
    System.out.printf("My Bubble Sort: %s\n", java.util.Arrays.toString(arr0));
    System.out.printf("Java Sort: %s\n", java.util.Arrays.toString(test0));
    System.out.println();

    System.out.printf("Unsorted List: %s\n", java.util.Arrays.toString(arr1));
    NuSorts.selectionSort(arr1);
    Arrays.sort(test1);
    System.out.printf("My Selection Sort: %s\n", java.util.Arrays.toString(arr1));
    System.out.printf("Java Sort: %s\n", java.util.Arrays.toString(test1));
    System.out.println();
    
    System.out.printf("Unsorted List: %s\n", java.util.Arrays.toString(arr2));
    NuSorts.insertionSort(arr2);
    Arrays.sort(test2);
    System.out.printf("My Insertion Sort: %s\n", java.util.Arrays.toString(arr2));
    System.out.printf("Java Sort: %s\n", java.util.Arrays.toString(test2));
    System.out.println();
    
    System.out.println("Bames Nond's having a stronk.");
    System.out.println("Call a Bondulance");
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
