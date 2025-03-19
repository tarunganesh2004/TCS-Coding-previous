import java.util.*;
public class spiralMatrix {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> res = spiralOrder(mat);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> spiralOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        List<Integer> res = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = m - 1;
        int colBegin = 0;
        int colEnd = n - 1;
        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // right
            for (int i = rowBegin; i <= colEnd; i++) {
                res.add(mat[rowBegin][i]);
            }
            rowBegin++;

            // down
            for (int i = rowBegin; i <= rowEnd; i++) {
                res.add(mat[i][colEnd]);
            }
            colEnd--;

            // left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    res.add(mat[rowEnd][i]);
                }
            }
            rowEnd--;

            // up
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    res.add(mat[i][colBegin]);
                }
            }
            colBegin++;
        }
        return res;
    }
}