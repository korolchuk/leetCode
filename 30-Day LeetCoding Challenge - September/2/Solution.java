class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
       TreeSet<Long> ts = new TreeSet<>();
        for(int i = 0; i < nums.length; ++i ) {
            Long f = ts.floor((long) nums[i]);
            if (f != null && nums[i] - f <= t ) {
                return true;
            }
            Long c = ts.ceiling((long) nums[i]);
            if (c != null && c - nums[i] <= t ) {
                return true;
            }
            ts.add((long) nums[i]);
            if(ts.size() > k) {
                ts.remove((long) nums[i - k]);
            }
            
        }
        return false;
    }
}