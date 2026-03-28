import java.io.*;
import java.util.*;

public class Bronze {

    public static long solve(String input_filename){
        try {
            File fileIn = new File("files/" + input_filename);
            Scanner input = new Scanner(fileIn);
            int r = input.nextInt();
            int c = input.nextInt();
            int e = input.nextInt();
            int n = input.nextInt();
            int[][] gamestate = new int[r][c];
            int[][] instrux = new int[n][3];
            for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) gamestate[i][j] = input.nextInt();
            for (int i = 0; i < n; i++) for (int j = 0; j < instrux[i].length; j++) instrux[i][j] = input.nextInt();
            input.close();
            // System.out.printf("Original Gamestate: \n%s\n\n", Arrays.deepToString(gamestate));
            // System.out.printf("Instructions: %s\n\n", Arrays.deepToString(instrux));
            for (int i = 0; i < n; i++) {
                int minDepth = 10000; // twice the max possible depth
                int r_s = instrux[i][0] - 1;
                int c_s = instrux[i][1] - 1;
                int stomps = instrux[i][2];
                for (int j = r_s; j < r_s + 3; j++) for (int k = c_s; k < c_s + 3; k++) minDepth = Math.min(minDepth, gamestate[j][k]);
                int maxDepth = 0;
                for (int j = r_s; j < r_s + 3; j++) for (int k = c_s; k < c_s + 3; k++) maxDepth = Math.max(maxDepth, gamestate[j][k]);
                int target = maxDepth - stomps;
                if (target >= minDepth) {
                    for (int j = r_s; j < r_s + 3; j++) for (int k = c_s; k < c_s + 3; k++) if (gamestate[j][k] > target) gamestate[j][k] = target;
                } else {
                    int remaining = stomps - (maxDepth - minDepth);
                    for (int j = r_s; j < r_s + 3; j++) for (int k = c_s; k < c_s + 3; k++) gamestate[j][k] = minDepth - remaining;
                }
            }
            // System.out.printf("Stomped Gamestate: \n%s\n\n", Arrays.deepToString(gamestate));
            long volume = 0;
            for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) if (gamestate[i][j] < e) volume += (e - gamestate[i][j]);
            return volume * 72 * 72;
        }
        catch (IOException e) {
            e.printStackTrace();
            return -1;
        }
    }

}
