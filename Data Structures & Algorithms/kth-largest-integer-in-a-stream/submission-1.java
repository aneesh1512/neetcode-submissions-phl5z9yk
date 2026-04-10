class KthLargest {
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    int kth = 0;
    public KthLargest(int k, int[] nums) {
        kth = k;
        int n = nums.length;
        for(int i = 0 ; i < n; i++){
            queue.add(nums[i]);
        }
        // System.out.println(kth);
    }
    
    public int add(int val) {
        // System.out.println(this.kth);
        queue.add(val);
        while(queue.size() > kth){
            queue.poll();
        } 
        return queue.peek();

    }
}
