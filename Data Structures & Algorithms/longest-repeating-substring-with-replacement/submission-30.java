class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int ans = 0;

        Set<Character> set = s.chars().mapToObj(c -> (char)c).collect(Collectors.toSet());

        for(Character ch:  set){
            int left = 0;
            int replacements = k;

            for(int right = 0; right < n; right++){

                if(s.charAt(right) != ch){
                    if(replacements > 0){
                        replacements--;
                    }else{
                        while(s.charAt((left)) == ch){
                            left++;
                        }
                        left++;
                    }
                }
                ans = Math.max(ans, right - left + 1);
            }
        }
        return ans;
        
    }
}
