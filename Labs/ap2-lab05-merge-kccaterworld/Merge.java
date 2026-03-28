import java.util.Arrays;

public class Merge {
    public static int[] mergeSort(int[] data) { return ((data.length <= 1) ? data : merge(mergeSort(Arrays.copyOfRange(data,0,data.length/2)), mergeSort(Arrays.copyOfRange(data,data.length/2, data.length)))); }

    public static void merge(int[] dest, int[] left, int[] right) { System.arraycopy(merge(left, right), 0, dest, 0, merge(left, right).length); }
    public static int[] merge(int[] left, int[] right) { int l = 0, r = 0; int[] returny = new int[left.length + right.length];
        for (int i = 0; i < returny.length; i++) returny[i] = (r >= right.length || (l < left.length && left[l] <= right[r])) ? left[l++] : right[r++];
        return returny; }

    public static int[] longarr(int lower, int upper, int length, boolean sort) { int[] returny = new int[length];
        for (int i = 0; i < length; i++) returny[i] = (int)(Math.random()*(upper-lower))+lower;
        if (sort) Arrays.sort(returny); return returny; }
}
