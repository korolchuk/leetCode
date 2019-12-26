class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length - 1; i++) {
            for(int j = prices.length - 1; j > i; j-- ) {
                if(max < (prices[j] - prices[i])) {
                    max = prices[j] - prices[i];
                }
            }

        }
        
        return max;
    }
}