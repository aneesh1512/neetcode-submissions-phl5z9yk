class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        if(s.isBlank() && s.length() == 1) return 1;
        int n = s.length();
        int arr[] = new int[128];
        int ans = 1;
        Arrays.fill(arr,-1);
        arr[s.charAt(0)] = 0;
        int initp = 0;
        for(int i = 1; i < n; i++){
            if(arr[s.charAt(i)] < initp){
                arr[s.charAt(i)] = i;
                ans = Math.max(ans, i - initp + 1);
            }else{
                initp = arr[s.charAt(i)]+1;
                arr[s.charAt(i)] = i;
                ans = Math.max(ans, i - initp + 1);
            }
        }
      return ans;
    }
}
