class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        StringBuilder sb = new StringBuilder();
        int cr = 1;
        for(int i = n-1; i >= 0; i--){
            if(digits[i] == 9 && cr == 1){
                sb.append("0");
            }else{
                if(cr == 1){
                    sb.append(digits[i]+1);
                    cr=0;
                }else{
                    sb.append(digits[i]);
                }
            }
        }
        if(cr == 1){
            sb.append(1);
        }
        int[] arr = Arrays.stream(sb.reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.toString(arr));
        // return Integer.valueOf(sb.reverse().toString(), 10);
        return arr;
    }
}
