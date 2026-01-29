import java.util.*;

public class BubbleSort{
    public static void main(String[] args) {
        int[] array = {5,0,-4,1,-1,0,0,-4,4,-1};
        System.out.println(Arrays.toString(array));
        int[] test = array.clone();
        Arrays.sort(test);
        bubblesort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(test));
        System.out.println(Arrays.equals(array,test));
    }
    public static void bubblesort(int[]data) {
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
}
