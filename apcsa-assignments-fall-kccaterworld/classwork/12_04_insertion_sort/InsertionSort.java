import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1,-7,2019,0,-50185,72,19}; //{5,0,-4,1,-1,0,0,-4,4,-1};
        int[] test = {1,-7,2019,0,-50185,72,19}; //{5,0,-4,1,-1,0,0,-4,4,-1};
        System.out.println(Arrays.toString(array));
        Arrays.sort(test);
        insertionSort(array);
        System.out.printf("My Sort: %s\n", Arrays.toString(array));
        System.out.printf("Java Sort: %s\n", Arrays.toString(test));
        System.out.printf("Comparison: %s\n", Arrays.equals(array,test));
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
                System.out.printf("Step %d, %d: %s: \n", i, j, Arrays.toString(data));
            }
            data[j + 1] = key;
        }
    }
}
