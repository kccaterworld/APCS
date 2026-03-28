import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        System.out.printf("Ceci n'est pas une pipe\n");
        // Merge Test Cases
        System.out.printf("%s\n", Arrays.toString(Merge.merge(new int[]{1,3,5}, new int[]{2,4,6})));
        System.out.printf("%s\n", Arrays.toString(Merge.merge(new int[]{2,5,8,11,14,17,20,23,26,29,32,35,38,41,44}, new int[]{1,3,6,9,12,15,18,21,24,27,30,33,36,39,42,45,48})));
        System.out.printf("%s\n", Arrays.toString(Merge.merge(new int[]{-50,-30,-10,0,10,30,50,70,90,110,130,150}, new int[]{-45,-25,-5,5,25,45,65,85,105,125,145})));
        System.out.printf("%s\n", Arrays.toString(Merge.merge( new int[]{1,2,3,4,5,6,7,8,9,10}, new int[]{11,12,13,14,15,16,17,18,19,20})));
        System.out.printf("%s\n", Arrays.toString(Merge.merge( new int[]{1,1,1,2,2,3,3,3,4,5,5,6}, new int[]{1,2,2,3,4,4,5,5,6,6,7,7,8})));
        System.out.printf("%s\n", Arrays.toString(Merge.merge(Merge.longarr(0, 200, 100, true), Merge.longarr(1, 200, 100, true))));
        System.out.printf("%s\n", Arrays.toString(Merge.merge(Merge.longarr(0, 100, 100, true), Merge.longarr(100, 200, 100, true))));
        System.out.printf("%s\n", Arrays.toString(Merge.merge(Merge.longarr(-500, 0, 100, true), Merge.longarr(-499, 0, 100, true))));
        System.out.printf("%s\n", Arrays.toString(Merge.merge(Merge.longarr(5, 505, 100, true), Merge.longarr(3, 503, 100, true))));
        // MergeSort Test Cases
        System.out.printf("%s\n", Arrays.toString(Merge.mergeSort(new int[]{2,1,3})));
        System.out.printf("%s\n", Arrays.toString(Merge.mergeSort(Merge.longarr(0,99,20,false))));
        System.out.printf("%s\n", Arrays.toString(Merge.mergeSort(new int[]{})));
        System.out.printf("\nC'est magique\n");
    }
}
