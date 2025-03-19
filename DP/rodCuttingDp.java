package DP;

public class rodCuttingDp {
    public static void main(String[] args) {
        int[] price = { 1, 5, 8, 9, 10, 17, 17, 20 };
        int n = price.length;
        System.out.println(rodCutting(price, n));
    }

    public static int rodCutting(int[] price, int n) {
        int[] length = new int[n];
        for (int i = 0; i < n; i++) {
            length[i] = i + 1; // rod lengths from 1 to n
        }
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (length[i - 1] <= j) {
                    // either we cut the rod or we don't
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j]; // skip
                }
            }
        }
        return dp[n][n];
    }
}
