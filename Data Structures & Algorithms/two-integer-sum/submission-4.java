class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int left = target - nums[i];
            if(map.containsKey(left)){
                ans[1] = i;
                ans[0] = map.get(left);
            }
            map.put(nums[i], i);
        }

        return ans;
    }
}
