import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {5,0,-4,1,-1,0,0,-4,4,-1};
        System.out.println(Arrays.toString(array));
        int[] test = array.clone();
        Arrays.sort(test);
        selectionSort(array);
        System.out.printf("My Sort: %s\n", Arrays.toString(array));
        System.out.printf("Java Sort: %s\n", Arrays.toString(test));
        System.out.printf("Comparison: %s\n", Arrays.equals(array,test));
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
}
