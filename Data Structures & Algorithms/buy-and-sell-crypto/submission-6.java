class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int ans = 0;
        int minimum = prices[0];
        int maximum = prices[0];

        for(int i = 1; i < n; i++){
            if(minimum > prices[i]){
                minimum = prices[i];
                maximum = prices[i];
            }else if(maximum < prices[i]){
                ans = Math.max(ans, prices[i] - minimum);
                maximum = prices[i];
            }
        }
        return ans;
    }
}
