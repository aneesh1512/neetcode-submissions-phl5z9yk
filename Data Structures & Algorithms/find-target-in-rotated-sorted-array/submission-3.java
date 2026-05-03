class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low+high) / 2;
             System.out.println(mid+ "   "+ low + "  "+ high);
            if(nums[mid] ==  target) return mid;

            if(nums[mid] >= nums[low]){
                if(nums[mid] >= target && target >= nums[low]){
                    high = mid - 1;
                }else{
                    low = mid + 1;
                }
            }else{
                if(nums[mid] <= target && target <= nums[n-1]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }
            System.out.println(mid+ "   "+ low + "  "+ high);
        }
        return -1;
    }
}
