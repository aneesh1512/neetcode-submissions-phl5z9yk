class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1) return 0;
        int ip = prices[0];
        int ans = 0;

        for(int i = 0; i < n; i++){
            if(ip > prices[i]){
                ip = prices[i];
            }
            ans = Math.max(ans, prices[i] - ip);

        }

        return ans;

    }
}
