class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.isEmpty()) return 0;
        if(s.isBlank()) return 1;
        int n = s.length();
        int l=0,r=0,ans=0;
        Set<Character> set =  new HashSet<>();

        while(r < n){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
            }else{
                while(set.contains(s.charAt(r))){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(s.charAt(r));
            }
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
}
