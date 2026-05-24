class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        int left = 0;
        int right = 0;

        int arr[] = new int[26];

        Arrays.fill(arr,-1);

        for(int i = 0; i < n; i++){
            if(arr[s1.charAt(i) - 97] == -1){
                arr[s1.charAt(i) - 97]+=2;
            }else{
                arr[s1.charAt(i) - 97]+=1;
            }
        }

        int ans = 0;

        for(int i = 0; i < m; i++){
            char ch = s2.charAt(i);

            if(arr[ch-97] == -1){
                while(left != i){
                        arr[s2.charAt(left)-97]++;
                        left++;
                }
                
                continue;
            }
            if(arr[ch-97] == 0){
                while(arr[ch-97] == 0){
                    arr[s2.charAt(left)-97]++;
                    left++;
                }
            }
            if(i >0 && arr[s2.charAt(i-1) - 97] == -1){
                left++;
            }
            arr[ch-97]--;
            ans = Math.max(ans, i-left+1);
            if(ans == n) return true;
        }

        return false;
    }
}
