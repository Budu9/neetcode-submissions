class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length <= 1) return 0;

        int maxProfit = 0;
        int i = 0;
        int j = 1;

        while (i < prices.length && j < prices.length) {
            if (prices[j]-prices[i] <= 0) {
                i++;
                if (i == j) {
                    j++;
                }
            }
            else {
                if (prices[j]-prices[i] > maxProfit) maxProfit = prices[j]-prices[i];
                j++;
            }
        }

        return maxProfit;
    }
}
