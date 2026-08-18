class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> mapCount = new HashMap<>();
        for(int value: nums){
            mapCount.computeIfPresent(value, (key,val) -> val+1);
            mapCount.putIfAbsent(value, 1);
        }

        TreeSet<Integer> set = new TreeSet<>(mapCount.values());
        List<Integer> list = new ArrayList<>();
        while(k > 0){
            int largest = set.pollLast();

            for(java.util.Map.Entry<Integer, Integer> pair: mapCount.entrySet()){
                if(pair.getValue() == largest){
                    list.add(pair.getKey());
                    k--;
                }
            }
        }


        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
