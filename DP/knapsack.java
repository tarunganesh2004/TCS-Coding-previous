package DP;

public class knapsack {
    public static void main(String[] args) {
        int[] wt = { 1, 3, 4, 5 };
        int[] val = { 1, 4, 5, 7 };
        int W = 7;
        int n = wt.length;
        System.out.println(knapsackDp(wt, val, W, n));
    }

    public static int knapsackDp(int[] wt, int[] val, int cap, int n) {
        if (n == 0 || cap == 0) {
            return 0;
        }
        int[][] dp = new int[n + 1][cap + 1];
        // Initialization
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < cap + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < cap + 1; j++) {
                if (wt[i - 1] <= j) {
                    dp[i][j] = Math.max(val[i - 1] + dp[i - 1][j - wt[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][cap];
    }
    
}
