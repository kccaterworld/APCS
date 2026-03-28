import java.io.File;
import java.util.Scanner;

public class Silver {

    public static long solve(String input_filename){
        try {
            File fileIn = new File("files/" + input_filename);
            Scanner input = new Scanner(fileIn);
            int n = input.nextInt();
            int m = input.nextInt();
            int t = input.nextInt();
            char[][] gamestate = new char[n][m];
            for (int i = 0; i < n; i++) gamestate[i] = input.next().toCharArray();
            int r1 = input.nextInt() - 1; // convert to 0-indexed
            int c1 = input.nextInt() - 1;
            int r2 = input.nextInt() - 1;
            int c2 = input.nextInt() - 1;
            input.close();
            int[] dr = {-1, 1, 0, 0};
            int[] dc = {0, 0, -1, 1};
            int[][] statebuf1 = new int[n][m];
            int[][] statebuf2 = new int[n][m];
            statebuf1[r1][c1] = 1;
            for (int step = 0; step < t; step++) {
                for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) statebuf2[i][j] = 0;
                for (int r = 0; r < n; r++) {
                    for (int c = 0; c < m; c++) {
                        if (statebuf1[r][c] > 0) {
                            for (int d = 0; d < 4; d++) {
                                int nr = r + dr[d];
                                int nc = c + dc[d];
                                if (nr >= 0 && nr < n && nc >= 0 && nc < m && gamestate[nr][nc] == '.') statebuf2[nr][nc] += statebuf1[r][c];
                            }
                        }
                    }
                }
                int[][] temp = statebuf1;
                statebuf1 = statebuf2;
                statebuf2 = temp;
            }
            return statebuf1[r2][c2];
        }
        catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}
