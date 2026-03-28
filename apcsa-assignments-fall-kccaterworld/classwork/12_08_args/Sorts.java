import java.util.*;

public class Sorts {
    public static void bubbleSort(int[]data) {
        for (int i = 1; i < data.length; i++) {
            boolean sortFlag = false;
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j + 1]) {
                    sortFlag = true;
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
            if (!sortFlag) break;
        }
    }

    public static void selectionSort(int[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int min = i;
            for (int j = i; j < data.length; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }
            int temp = data[i];
            data[i] = data[min];
            data[min] = temp;
        }
    }
  
    public static void insertionSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int key = data[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (data[j] > key) {
                    data[j + 1] = data[j];
                } else {
                    data[j + 1] = key;
                    break;
                }
            }
            data[j + 1] = key;
        }
    }
  
}
