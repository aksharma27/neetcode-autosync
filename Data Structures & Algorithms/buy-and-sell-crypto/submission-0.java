class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1;
        int prof = 0;
        while (j < prices.length) {
            if (prices[j] > prices[i]) {
                prof = Math.max(prof, prices[j] - prices[i]);
                j++;
            } else {
                i = j;
                j++;
            }
        }
        return prof;
    }
}
