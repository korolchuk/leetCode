class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int i = 0;
        for(String str : strs) {
            String tmp = sortString(str);
            if(map.containsKey(tmp)) {
                int group = map.get(tmp);
                res.get(group).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                res.add(list);
                map.put(tmp, i);
                i++;
            }
        }
        return res;
        
    }
    
    public String sortString(String s) {
        char tmp[] = s.toCharArray(); 
        Arrays.sort(tmp); 
        return new String(tmp); 
    }
}