// import java.util.Map.Entry;
class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int right = 0;
        int ans = 0;

        while(right < n){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0)+1);
            int maxV=getMaxValueFromMap(map);
            if((right-left+1)-maxV <= k){
                 ans = Math.max(ans, right - left + 1);
                // right++;
            }else{
                Integer val = map.get(s.charAt(left));
                map.put(s.charAt(left), --val);
                left++;
            }
              right++;
        }
        return ans;

    }

            private int getMaxValueFromMap(Map<Character, Integer> map){
            int ans = 0;
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                ans = Math.max(ans, entry.getValue());
            }
            return ans;
        }
}
