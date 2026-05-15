class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();

        if(s == null || s.isEmpty()) return 0;
        if(s.length() == 1) return 1;

        Character curr = s.charAt(0);
        int init = 0;
        int ans =0;
        Integer temp=k;
        for(int i = 1; i < n; i++){
            if(s.charAt(i) != curr){
                int index = i;
                for(; index < s.length(); index++){
                    if(curr != s.charAt(index)){
                        if(temp == 0) break;
                        temp--;
                    }
                }
                System.out.println("i=="+i+"imndex==="+index+"indit=="+init+"temp==="+temp);
                if(index >= s.length()){
                    // if(temp > 0){
                        ans = Math.max(ans, (index-1) - init + 1 +temp);
                    // }
                    ans = Math.min(ans, s.length());
                    // ans = Math.max(ans, index-1 - init + 1);
                    // if(temp > 0){
                        
                    // }
                    // return ans;
                }
                // System.out.println("endi=="+endi);
                ans = Math.max(ans, (index-1 - init +1));
                // System.out.println("Ans==="+ans);
                init = i;
                curr = s.charAt(i);
                temp=k;
            }else{
                ans = Math.max(ans, (i - init +1));
            }
        }
        // System.out.println("Ans==="+ans+temp);
        ans = Math.max(ans, ((n-1) - init +1)+temp);

         System.out.println("Ans===ehere"+ans);
          ans = Math.min(ans, s.length());
        return ans;
    }
}
