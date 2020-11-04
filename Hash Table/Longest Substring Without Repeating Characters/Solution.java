class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int tmp = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i <s.length(); i++) {
            Character ch = s.charAt(i);
            if (map.containsKey(ch)) {
                tmp = Math.min(tmp + 1, i - map.get(ch));
            }  else {
                tmp++; 
            }
            map.put(ch, i);
            res = Math.max(res, tmp);
        }
        return res;
    }
}