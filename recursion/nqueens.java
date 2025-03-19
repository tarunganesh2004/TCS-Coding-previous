package recursion;
import java.util.*;

public class nqueens {
    public static void main(String[] args) {
        int n = 4;
        int[][] board = new int[n][n];
        Nqueens(board);
    }

    public static void Nqueens(int[][] board) {
        // pos diag
        // neg diag
        // col
        Set<Integer> posDiag = new HashSet<>();
        Set<Integer> negDiag = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        nqueensUtil(board, 0, posDiag, negDiag, col);

    }

    public static void nqueensUtil(int[][] board, int row, Set<Integer> posDiag, Set<Integer> negDiag,
            Set<Integer> col) {
        if (row == board.length) {
            printBoard(board);
            return;
        }
        for (int i = 0; i < board.length; i++) {
            if (!posDiag.contains(row + i) && !negDiag.contains(row - i) && !col.contains(i)) {
                board[row][i] = 1;
                posDiag.add(row + i);
                negDiag.add(row - i);
                col.add(i);
                nqueensUtil(board, row + 1, posDiag, negDiag, col);
                board[row][i] = 0;
                posDiag.remove(row + i);
                negDiag.remove(row - i);
                col.remove(i);
            }
        }
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] == 1 ? "Q" : ".");
            }
            System.out.println();
        }
        System.out.println();
    }
}

