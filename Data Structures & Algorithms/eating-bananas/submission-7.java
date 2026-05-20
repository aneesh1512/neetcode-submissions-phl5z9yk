class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        Arrays.sort(piles);
        int low = 1;
        int high = piles[n-1];
        int ans = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(checkK(piles, mid, h)){
                if(ans == -1){
                    ans = mid;
                }else{
                    ans = Math.min(ans, mid);
                }
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }

        return ans;

    }

    private boolean checkK(int[] piles, int k, int h){
        int hrs = 0;
        int n = piles.length;
        for(int i = 0; i < n; i++){
            hrs += piles[i]/k;
            if(piles[i] % k > 0){
                hrs+=1;
            }
        }
        if(hrs <= h){
            return true;
        }
        return false;
    }
}
