class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int mini = prices[0];
        int ans = 0;
        for(int i = 1; i < n; i++){
            if(prices[i] < mini){
                mini = prices[i];
            }else{
                ans = Math.max(prices[i] - mini, ans);
            }
        }
        return ans;
    }
}
