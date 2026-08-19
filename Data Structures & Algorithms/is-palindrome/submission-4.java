class Solution {
    public boolean isPalindrome(String s) {

        int n = s.length();
        int initp = 0;
        int end = n-1;

        while(initp < end){
            while(initp < n && !Character.isLetterOrDigit(s.charAt(initp))){
                initp++;
            }
            if(initp >= n) break;
            char ich =Character.toLowerCase(s.charAt(initp));
            while(end > 0 && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            if(end <= 0 ) break;
            char ech = Character.toLowerCase(s.charAt(end));

            if(ich != ech){
                // System.out.println(ich+ " " + ech);
                return false;
            } 
            initp++;
            end--;
        }
        return true;



        
    //     String filteredString = s.chars().filter(ch -> Character.isLetterOrDigit(ch)).
    //     mapToObj(ch -> String.valueOf((char) ch)).map(st -> st.toLowerCase())
    //     .collect(Collectors.joining());

    //     // System.out.println(filteredString);

    //     int n = filteredString.length();
    //     for(int i = 0; i < n/2; i++){
    //         if(filteredString.charAt(i) != filteredString.charAt(n-1-i)){
    //             // System.out.println(filteredString.charAt(i) + " " + filteredString.charAt(n-1-i));
    //             return false;
    //         }
    //     }

        
    //     // System.out.println(filteredString);
    //     return true;
    // }
    }
}
