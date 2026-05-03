class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        if(s.isEmpty()) return 0;
        if(s.isBlank() || s.length() == 1) return 1;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int initp = 0;
        set.add(s.charAt(0));
        for(int i = 1; i < n; i++){
            if(set.contains(s.charAt(i))){
                while(set.contains(s.charAt(i))){
                    set.remove(s.charAt(initp));
                    initp++;
                }
            }
            set.add(s.charAt(i));
            ans = Math.max(ans, i - initp + 1);
        }
        return ans;
    }
}
