public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        
        //Use this method to print the chess board onto the console
        int[] bRo1 = {0, 0};
        int[] bRo2 = {0, 7};
        int[] bKn1 = {0, 1};
        int[] bKn2 = {0, 6};
        int[] bBi1 = {0, 2};
        int[] bBi2 = {0, 5};
        int[] bQu = {0, 3};
        int[] bKi = {0, 4};
        int[][] bPa = {{1, 0}, {1, 1}, {1, 2}, {1, 3}, {1, 4}, {1, 5}, {1, 6}, {1, 7}};

        int[] wRo1 = {7, 0};
        int[] wRo2 = {7, 7};
        int[] wKn1 = {7, 1};
        int[] wKn2 = {7, 6};
        int[] wBi1 = {7, 2};
        int[] wBi2 = {7, 5};
        int[] wQu = {7, 3};
        int[] wKi = {7, 4};
        int[][] wPa = {{6, 0}, {6, 1}, {6, 2}, {6, 3}, {6, 4}, {6, 5}, {6, 6}, {6, 7}};

        chess[bRo1[0]][bRo1[1]] = "Rook";
        chess[bRo2[0]][bRo2[1]] = "Rook";
        chess[bKn1[0]][bKn1[1]] = "Knight";
        chess[bKn2[0]][bKn2[1]] = "Knight";
        chess[bBi1[0]][bBi1[1]] = "Bishop";
        chess[bBi2[0]][bBi2[1]] = "Bishop";
        chess[bQu[0]][bQu[1]] = "Queen";
        chess[bKi[0]][bKi[1]] = "King";
        for (int[] pos : bPa) {
            chess[pos[0]][pos[1]] = "Pawn";
        }

        chess[wRo1[0]][wRo1[1]] = "Rook";
        chess[wRo2[0]][wRo2[1]] = "Rook";
        chess[wKn1[0]][wKn1[1]] = "Knight";
        chess[wKn2[0]][wKn2[1]] = "Knight";
        chess[wBi1[0]][wBi1[1]] = "Bishop";
        chess[wBi2[0]][wBi2[1]] = "Bishop";
        chess[wQu[0]][wQu[1]] = "Queen";
        chess[wKi[0]][wKi[1]] = "King";
        for (int i = 0; i < wPa.length; i++) {
            chess[wPa[i][0]][wPa[i][1]] = "Pawn";
        }

        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[i].length; j++) {
                if (chess[i][j] == null) chess[i][j] = " -";
            }
        }

        print(chess);
        

    }
    
    public static void print(String[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
                }
            System.out.println();
        }
    }
}
