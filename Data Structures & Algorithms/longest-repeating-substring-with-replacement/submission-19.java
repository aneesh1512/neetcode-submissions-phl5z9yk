class Solution {
    public int characterReplacement(String s, int k) {
        char arr[] = s.toCharArray();
       Set<Character> set = s.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.toSet());
        System.out.println(set);
        int n = s.length();
        int ans = 0;
        for(Character ch: set){
            int l = 0;
            int r = 0;
            int temp  = k;
            while( r < n){
                if(s.charAt(r) != ch){
                    if(temp == 0){
                        while(s.charAt(l) == ch){
                            l++;
                        }
                        l++;
                        temp++;
                        continue;
                    }
                    temp--;
                }
                    r++;
                ans = Math.max(ans, (r-l));
            }
            
            if(temp != 0)
                ans = Math.min(Math.max(ans, (r-l+temp)), s.length());
            else
                ans = Math.max(ans, (r-l));
        }


        return ans;
    }
}
