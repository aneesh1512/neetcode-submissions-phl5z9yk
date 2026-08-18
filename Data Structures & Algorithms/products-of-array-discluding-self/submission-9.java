class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int preMul[] = new int[n];
        int sufMul[] = new int[n];
        preMul[0] = nums[0];
        sufMul[n-1] = nums[n-1];
        for(int i = 1; i < n; i++){
            preMul[i] = nums[i] * preMul[i-1];
            sufMul[n-1-i] = nums[n-1-i] * sufMul[n-i]; 
        }

        int ans[] = new int[n];
        
        for(int i = 0; i < n; i++){
            if(i-1 < 0){
                ans[i] = sufMul[i+1];
            }
            else if(i+1 >= n){
                ans[i] = preMul[i-1];
            }else{
                ans[i] = preMul[i-1] * sufMul[i+1];
            }
        }
        return ans;
    }
}  
