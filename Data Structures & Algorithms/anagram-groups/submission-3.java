class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String sn = new String(s);
            if(!map.containsKey(sn)){
                map.put(sn,new ArrayList<>());
            }
            map.get(sn).add(strs[i]);
        }
            return new ArrayList<>(map.values());
    }
}
