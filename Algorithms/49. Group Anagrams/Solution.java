class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        
        for(String str : strs) {
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String tmp = new String(arr);
            List<String> l = null;
            if(map.get(tmp) != null) {
                l = map.get(tmp);  
            } else {
                l = new ArrayList<>();
            }
            l.add(str);
            map.put(tmp, l);
        }
        
        for (Map.Entry m : map.entrySet()) {
           res.add((List<String>)m.getValue());
        }
        
        return res;
    }
}