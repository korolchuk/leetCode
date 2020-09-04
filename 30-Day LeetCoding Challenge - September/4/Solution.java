class Solution {
    public List<Integer> partitionLabels(String S) {
        List<Integer> res = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>(); 
        for(int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), i);
        }
        int start = 0;
        int last = 0;
        
        for(int i = 0; i < S.length(); i++) {
            last = Math.max(last, map.get(S.charAt(i)));
            if (last == i) {
                res.add(last - start + 1);
                start = last + 1;
            }
        }
    
        return res;
    }
}