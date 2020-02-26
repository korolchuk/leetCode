class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        
        for(int a : arr) {
            if(map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a, 1);
            }
        }
        
        for(Integer m : map.values()) {
            set.add(m);
        }
        
        if(map.size() == set.size()) {
            return true;
        }
        
        return false;
    }
}