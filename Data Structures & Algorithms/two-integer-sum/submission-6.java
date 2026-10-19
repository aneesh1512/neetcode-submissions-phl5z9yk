class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int ans[] = new int[2];
        map.put(nums[0], 0);

        for(int i = 0; i < n; i++){
            if(map.containsKey(target - nums[i])){
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
