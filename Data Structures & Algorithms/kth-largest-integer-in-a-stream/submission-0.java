class KthLargest {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    int kth = 0;
    public KthLargest(int k, int[] nums) {
        kth = k;
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        queue.add(val);
        while(queue.size() > kth){
            queue.poll();
        } 
        return queue.peek();

    }
}
