class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
       int ans = 0;
       Set<Integer> set = new HashSet<>();
       for(int i = 0; i < n; i++){
            set.add(nums[i]);
       }
       for(int i = 0; i < n; i++){
        int num = nums[i];
        if(!set.contains(num-1)){
            ans = Math.max(ans,checkSequence(num, set));
        }
       } 
       return ans;
    }
}

    private int checkSequence(int num, Set<Integer> set){
        int length = 1;
        while(set.contains(num+1)){
            length++;
            num+=1;
        }
        return length;    
    }

