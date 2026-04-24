class Solution {
    public int hammingWeight(int n) {
     int one = 1;
     int ans = 0;
     int maxcount = 32;
     while((maxcount > 0)){
        if((one & n) != 0){
            ans++;
        }
        one = one << 1;
        maxcount--;
     }   
     return ans;
    }
}
