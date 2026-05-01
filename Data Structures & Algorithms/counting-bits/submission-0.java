class Solution {
    public int[] countBits(int n) {
        int ans[] = new int[n+1];
        for(int i = 0; i <= n; i++){
            int v = countOnes(i);
            ans[i] = v;
        }
        return ans;
    }

    private int countOnes(int i){
        int ones = 1;
        int ans = 0;
        while(ones <= i){
            if((ones & i) > 0){
                ans++;
            }
            ones = ones << 1;
        }
        return ans;
    }
}
