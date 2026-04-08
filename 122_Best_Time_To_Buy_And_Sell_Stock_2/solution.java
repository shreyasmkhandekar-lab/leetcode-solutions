class Solution {
    public int maxProfit(int[] prices) {
        int totalProfit = 0;

        for (int day = 1; day < prices.length; day++) {

            int dailyProfit = prices[day] - prices[day - 1];

            totalProfit += Math.max(0, dailyProfit);
        }
        return totalProfit;
    }
}