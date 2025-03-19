public class boundaryElementsSum {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        for(int[] i: mat){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println(boundarySum(mat));
    }
    public static int boundarySum(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
