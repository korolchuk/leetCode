class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;
        for(int n : nums) {
            max = Math.max(n, max);
            set.add(n);
        }
        for(int i = 1; i <= max; i++) {
            if(! set.contains(i)) {
                return i;
            }
        }
        
        return max + 1;
    }
}