import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,3,4,5,6,7}, 0, 6, 5));
    }
    
    public static int binarySearch(int[] arr, int low, int high, int target) {
        Arrays.sort(arr);
        if (arr[low + (high - low) / 2] == target) return low + (high - low) / 2;
        if (arr[low + (high - low) / 2] < target) return binarySearch(arr, (low + (high - low) / 2) + 1, high, target);
        if (arr[low + (high - low) / 2] > target) return binarySearch(arr, low, (low + (high - low) / 2) - 1, target);
        return -1;
    }
}
