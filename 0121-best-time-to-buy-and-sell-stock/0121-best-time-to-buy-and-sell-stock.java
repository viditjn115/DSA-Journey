class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int max_prof=0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                profit=prices[i]-buy;
                max_prof=Math.max(max_prof,profit);
            }
        }
        return max_prof;
    }
}