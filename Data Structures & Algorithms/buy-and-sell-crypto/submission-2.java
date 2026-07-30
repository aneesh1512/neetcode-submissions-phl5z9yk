class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 1) return 0;
        int ans = 0;
        int[] maxC = new int[prices.length];
        maxC[n-1]=prices[n-1];

        for(int i = n-2; i >=0; i--){
            maxC[i] = Math.max(prices[i], maxC[i+1]);
        }

        for(int i = 0; i < n; i++){
            ans=Math.max( maxC[i] - prices[i] , ans);
        }
        System.out.println(Arrays.toString(maxC));
        return ans;

    }
}
