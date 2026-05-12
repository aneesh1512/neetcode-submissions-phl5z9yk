class Solution {
    public int maxProfit(int[] prices) {
        int initp = 0;
        int n = prices.length;
        int ip = prices[0];
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(prices[i]<ip){
                ip=prices[i];
            }else{
                ans = Math.max(ans, prices[i] - ip);
            }
        }

        return ans;
    }
}
