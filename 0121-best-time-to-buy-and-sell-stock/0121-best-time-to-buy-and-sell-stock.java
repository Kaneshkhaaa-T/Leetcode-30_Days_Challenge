class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int miniPrice = prices[0];

        for (int i = 0; i < prices.length ; i++) {
            int cost = prices[i] - miniPrice;
            maxProfit = Math.max(cost, maxProfit);
            miniPrice = Math.min(miniPrice, prices[i]);
        }

        return maxProfit;
    }
}