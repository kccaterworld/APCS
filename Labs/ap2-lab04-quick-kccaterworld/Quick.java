public class Quick {
    public static int partition(int[] data, int start, int end) {
        int pivot = data[start]; int left = start + 1; int right = end;
        while (left != right && left < right) {
            if (data[left] <= pivot) left++;
            if (data[left] > pivot) { int temp = data[right]; data[right] = data[left]; data[left] = temp; right--; } }
        if (data[left] <= pivot) { int temp = data[left]; data[left] = pivot; data[start] = temp; return left; }
        else { int temp = data[left - 1]; data[left - 1] = pivot; data[start] = temp; return left - 1; } }

    public static int quickSelect(int[] data, int k) { return quickSelect(data, k, 0, data.length - 1); }
    public static int quickSelect(int[] data, int k, int start, int end) { int pivot = partition(data, start, end);
        return ((pivot == (k - 1)) ? data[k - 1] : ((pivot < (k - 1)) ? quickSelect(data, k, pivot + 1, end) : ((pivot > (k - 1)) ? quickSelect(data, k, start, pivot - 1) : -1))); }

    public static void quickSort(int[] data) { quickSort(data, 0, data.length - 1); }
    public static void quickSort(int[] data, int start, int end) { if (start >= end) return; int pivot = partition(data, start, end);
        quickSort(data, start, pivot - 1); quickSort(data, pivot + 1, end); }
}
