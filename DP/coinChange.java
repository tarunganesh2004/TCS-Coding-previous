package DP;

import java.util.Arrays;

public class coinChange {
    public static void main(String[] args) {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        System.out.println(coinChangeDP(coins, amount));
    }

    public static int coinChangeDP(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        if (dp[amount] == amount + 1) {
            return -1;
        } else {
            return dp[amount];
        }
    }
    
    // count ways
    public static int coinchangeCountWaysDP(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
