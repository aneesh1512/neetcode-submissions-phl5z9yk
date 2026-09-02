class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s == null || s.length() == 0) return 0;
        if(s.isBlank()) return 1;

        Set<Character> set = new HashSet<>();

        int n = s.length();
        int left = 0;
        int ans = 0;

        for(int i = 0; i < n; i++){
            Character ch = s.charAt(i);
            if(set.contains(ch)){
                while(set.contains(ch)){
                    set.remove(s.charAt(left));
                    left++;
                }
            }
                set.add(ch);
            
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}
