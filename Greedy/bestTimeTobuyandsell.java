package Greedy;

public class bestTimeTobuyandsell {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        // int maxProfit = 0;
        // for (int i = 1; i < prices.length; i++) {// multple transactions allowed
        //     if (prices[i] > prices[i - 1]) {
        //         maxProfit += prices[i] - prices[i - 1];
        //     }
        // }
        // return maxProfit;
        // only one transaction allowed
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
    
}
