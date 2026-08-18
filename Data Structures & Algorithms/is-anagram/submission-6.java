class Solution {
    public boolean isAnagram(String s, String t) {
        int [] arr = new int[26];

        int n1 = s.length();
        int n2 = t.length();

        if(n1 != n2) return false;

        for(int i = 0; i < n1; i++){
            arr[s.charAt(i) - 97]++;
            arr[t.charAt(i) - 97]--;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] != 0) return false;
        }

        return true;
    }
}
