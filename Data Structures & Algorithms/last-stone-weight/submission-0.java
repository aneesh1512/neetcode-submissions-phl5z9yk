class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new  PriorityQueue<>((a,b) -> b-a);
        int n = stones.length;

        for(int i = 0 ; i < n; i++){
            queue.offer(stones[i]);
        }

        while(!(queue.isEmpty() || queue.size() == 1)){
            int l1 = queue.poll();
            int l2 = queue.poll();
            if(l1 != l2){
                queue.offer(Math.abs(l1-l2));
            }
            System.out.println(queue);
        }
        return queue.size() == 1 ? queue.poll() : 0;
    }
}
