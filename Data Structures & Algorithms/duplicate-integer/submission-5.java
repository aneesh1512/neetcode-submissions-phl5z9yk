class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set =                      Arrays.stream(nums).mapToObj(Integer::valueOf).collect(Collectors.toSet());
        if(set.size() == nums.length) return false;
        return true;
    }
}