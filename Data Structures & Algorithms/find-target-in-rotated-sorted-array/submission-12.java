class Solution {
    public int search(int[] nums, int target) {

        int n = nums.length;

        if(n == 1){
                if(nums[0] == target){
                    return 0;
                }else{
                    return -1;
                }      
        }
        
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        
        while(low <= high){
            int mid = (low+high)/2;
            System.out.println(mid);
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            System.out.println(nums[low] + "  " + nums[mid]);

            if(nums[low] <= nums[mid]){
                if(target <= nums[mid] && target >= nums[low]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(target>= nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }            

            
        }


        return ans;
        
    }
}
