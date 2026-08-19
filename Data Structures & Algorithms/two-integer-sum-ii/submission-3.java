class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int ans[] = new int[2];
        int l = 0;
        int r = n-1;

        while(l<r){
            if((numbers[l] + numbers[r]) < target){
                l++;
            }else if((numbers[l] + numbers[r]) > target){
                r--;
            }else{
                ans[0] = l+1;
                ans[1] = r+1;
                break;
            }
        }

        return ans;
    }
}
