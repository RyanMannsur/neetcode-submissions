class Solution {
    public int maxProfit(int[] prices) {
        int buyValue = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int currentProfit = prices[i] - buyValue;
            if (currentProfit > profit) {
                profit = currentProfit;
            } else if (currentProfit < 0) {
                buyValue = prices[i];
            }
        }
        return profit;
    }
}