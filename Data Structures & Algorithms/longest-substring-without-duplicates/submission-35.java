class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();
        int n = s.length();
        int left = 0;
        int ans = 0;
        for(int right = 0; right < n; right++){
            Character ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
            }else{
                while(set.contains(ch)){
                    set.remove((s.charAt(left)));
                    left++;
                }
                set.add(ch);
            }

            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
