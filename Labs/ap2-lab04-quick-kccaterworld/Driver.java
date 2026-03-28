public class Driver { 
    public static void main(String[] args) {
        System.out.printf("Ceci n'est pas une pipe.\n\n");

        // Partition Test Cases
        int[] ptest6 = new int[]{1,2,3,4,5,6};
        System.out.printf("%d\n",Quick.partition(ptest6, 0, ptest6.length-1)); /*0*/
        int[] ptest7 = new int[]{20,56,7,5,21,6,5};
        System.out.printf("%d\n",Quick.partition(ptest7, 0, ptest7.length-1)); /*4*/
        int[] ptest8 = new int[]{13,20,56,7,13,21,6,13};
        System.out.printf("%d\n",Quick.partition(ptest8, 0, ptest8.length-1)); /*4*/

        // Quickselect Test Cases
        int[] qtest6 = new int[]{1,2,3,4,5,6}; System.out.printf("%d\n",Quick.quickSelect(qtest6, 3)); /*3*/
        int[] qtest7 = new int[]{20,56,7,5,21,6,5}; System.out.printf("%d\n",Quick.quickSelect(qtest7, 2)); /*5*/ System.out.printf("%d\n",Quick.quickSelect(qtest7, 3)); /*6*/
        int[] qtest8 = new int[]{13,20,56,7,13,21,6,13}; System.out.printf("%d\n",Quick.quickSelect(qtest8, 5)); /*13*/

        // Quicksort Test Cases
        int[] stest6 = new int[]{1,2,3,4,5,6}; Quick.quickSort(stest6); System.out.printf("%s\n",java.util.Arrays.toString(stest6)); /*[1, 2, 3, 4, 5, 6]*/
        int[] stest7 = new int[]{20,56,7,5,21,6,5}; Quick.quickSort(stest7); System.out.printf("%s\n",java.util.Arrays.toString(stest7)); /*[5, 5, 6, 7, 20, 21, 56]*/
        int[] stest8 = new int[]{13,20,56,7,13,21,6,13}; Quick.quickSort(stest8); System.out.printf("%s\n",java.util.Arrays.toString(stest8)); /*[6, 7, 13, 13, 13, 20, 21, 56]*/

        System.out.printf("\nC'est magique!\n");
    }
}
