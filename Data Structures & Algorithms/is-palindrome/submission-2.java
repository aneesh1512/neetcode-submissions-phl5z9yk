class Solution {
    public boolean isPalindrome(String s) {






        
        String filteredString = s.chars().filter(ch -> Character.isLetterOrDigit(ch)).
        mapToObj(ch -> String.valueOf((char) ch)).map(st -> st.toLowerCase())
        .collect(Collectors.joining());

        // System.out.println(filteredString);

        int n = filteredString.length();
        for(int i = 0; i < n/2; i++){
            if(filteredString.charAt(i) != filteredString.charAt(n-1-i)){
                // System.out.println(filteredString.charAt(i) + " " + filteredString.charAt(n-1-i));
                return false;
            }
        }

        
        // System.out.println(filteredString);
        return true;
    }
}
