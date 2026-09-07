class Solution {
    public int characterReplacement(String s, int k) {
        if(s == null){
            return 0;
        }
        if(s.length() == 1){
            return 1;
        }
        int ans = 0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        for(int i = 0 ; i < n; i++){
            set.add(s.charAt(i));
        }
        for(Character ch: set){
            int left = 0;
            int temp = k;
            for(int i = 0; i < n; i++){
                if(ch != s.charAt(i)){
                    if(temp > 0){
                        temp--;
                    }else{
                        while(s.charAt(left) == ch){
                            left++;
                        }
                        left++;
                        temp=k;
                        i=left-1;
                    }
                   
                }
                ans = Math.max(ans, i-left+1);

            }
            if(temp>0){
                ans = Math.min(temp+ans, n);
            }

        }
        return ans;
    }
}
