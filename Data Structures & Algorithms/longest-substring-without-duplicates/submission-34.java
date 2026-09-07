class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();

        int n = s.length();
        int left = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                while (set.contains(s.charAt(i))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(i)); // FIX
            }

            ans = Math.max(ans, i - left + 1);
        }

        return ans;
    }
}
