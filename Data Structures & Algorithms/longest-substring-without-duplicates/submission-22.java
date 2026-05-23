class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        int ans = 0;
        int init = 0;
        for(int i = 0; i < n; i++){
            while(set.contains(s.charAt(i))){
                set.removeFirst();
                init++;
                // continue;
            }
            set.add(s.charAt(i));
            ans = Math.max(ans, (i - init + 1));
        }
        System.out.println(ans);
        return ans;
    }
}
