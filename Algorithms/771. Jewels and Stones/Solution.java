class Solution {
    public int numJewelsInStones(String J, String S) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        
        for(Character val : S.toCharArray()) {
            if (map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            } else {
                map.put(val, 1);
            }
        }
        
        for(Character val : J.toCharArray()) {
            if (map.containsKey(val)) {
                res += map.get(val);
            }
        }
        
        return res;
    }
}