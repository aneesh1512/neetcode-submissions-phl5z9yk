class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int n = numbers.length;

       int init = 0;
       int end = n-1;

       while(init < end){
        int sum = numbers[init] + numbers[end];
        if(sum == target) return new int[]{init+1, end+1};
        if(sum > target){
            end--;
        }else{
            init++;
        }
       }
       return null; 
    }
}
