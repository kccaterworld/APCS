import java.util.*;
import java.io.*;

public class CountTriangles {
    public static void main(String[] args){
        try {
            int[][] inputArray = new int[1915][3];
            File inputFile = new File("input.txt");
            Scanner input = new Scanner(inputFile);
            int i = 0;
            int j = 0;
            while (input.hasNextInt()) {
                inputArray[i][j % 3] = input.nextInt();
                j++;
                if (j % 3 == 0) i++; 
            }
            int count = 0;
            for (int[] row:inputArray) {
                if ((Integer.valueOf(row[0]) + Integer.valueOf(row[1]) > Integer.valueOf(row[2])) &&
                    (Integer.valueOf(row[2]) + Integer.valueOf(row[1]) > Integer.valueOf(row[0])) &&
                    (Integer.valueOf(row[0]) + Integer.valueOf(row[2]) > Integer.valueOf(row[1]))) count++;
            }
            System.out.println(count);
            count = 0;
            for (int k = 0; k < 1914; k += 3) {
                for (int l = 0; l < 3; l++) {
                    int c = inputArray[k + 2][l];
                    if ((Integer.valueOf(inputArray[k][l]) + Integer.valueOf(inputArray[k + 1][l]) > Integer.valueOf(inputArray[k + 2][l])) &&
                        (Integer.valueOf(inputArray[k + 2][l]) + Integer.valueOf(inputArray[k + 1][l]) > Integer.valueOf(inputArray[k][l])) &&
                        (Integer.valueOf(inputArray[k][l]) + Integer.valueOf(inputArray[k + 2][l]) > Integer.valueOf(inputArray[k + 1][l]))) count++;
                }
            }
            System.out.println(count);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
