class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            if(set.contains(n)) {
                set.remove(n);
            } else {
                set.add(n);
            }
        }
        
        for(Integer res : set) {
            return res;
        }
        
        return 0;

    }
}