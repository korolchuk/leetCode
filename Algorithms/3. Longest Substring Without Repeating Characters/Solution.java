class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int tmp = 0;
        Map<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            if (map.containsKey(arr[i])) {
                tmp = Math.max(tmp, map.get(arr[i]));
            }
            map.put(arr[i], i + 1);
            res = Math.max(res, i - tmp + 1);
        }
        return res;
    }
}