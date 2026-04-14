class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        // StringBuilder sb = new StringBuilder();
        int cr = 1;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] == 9 && cr == 1){
                // sb.append("0");
                digits[i] = 0;
            }else{
                if(cr == 1){
                    // sb.append(digits[i]+1);
                    digits[i] = digits[i] + 1;
                    cr=0;
                }else{
                    // sb.append(digits[i]);
                }
            }
        }
        if(cr == 1){
            int[] ans = new int[n+1];
            for(int i = 0; i < n; i++){
                ans[i+1] = digits[i];
            }
            ans[0]=1;
            return ans;
        }
        return digits;
    }
}
