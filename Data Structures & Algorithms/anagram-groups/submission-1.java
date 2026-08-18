class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String sn = new String(s);
            boolean found = false;
            if(map.isEmpty()){
                addNewEntry(map, sn, strs[i]);   
                continue;
            }else{
                for(String key: map.keySet()){
                    if(key.equals(sn)){
                        map.get(key).add(strs[i]);
                        found = true;
                        break;
                    }
                }
            }

            if(!found){
                 addNewEntry(map, sn, strs[i]);               
            }
        }

        for(List<String> values: map.values()){
            ans.add(values);
        }

        return ans;
    }

    private void addNewEntry(Map<String, List<String>> map, String sn, String str){
                List l = new ArrayList();
                l.add(str);
                map.put(sn,l);
    }
}
