class Solution {
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int m = s.length();
        int ans = 0;
        for(int i = 0; i < m; i++){
            if(s.charAt(i) == '1')
                ans++;
        }

        return ans;












    //  int one = 1;
    //  int ans = 0;
    //  while(one < n){
    //     if((one & n) != 0){
    //         ans++;
    //     }
    //     one = one << 1;
    //  }   
    //  return ans;
    }
}
