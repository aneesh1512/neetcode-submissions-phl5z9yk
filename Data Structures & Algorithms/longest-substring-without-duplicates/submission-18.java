class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()){
            return 0;
        }
        if(s.isBlank()){
            return 1;
        }
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int init = 0;
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(init));
                    init++;
                }
            }
                set.add(s.charAt(i));
                ans = Math.max(ans, (i-init+1));
        }
        return ans;
    }
}
