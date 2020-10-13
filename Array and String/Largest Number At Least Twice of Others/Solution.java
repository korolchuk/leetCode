class Solution {
    public int dominantIndex(int[] nums) {
        int res = 0;
        int max1 = 0;
        int max2 = 0;
        for(int i = 0; i < nums.length; i++) {
            if(max1 < nums[i]) {
                max2 = max1;
                max1 = nums[i];
                res = i;
            } else if (max2 < nums[i]) {
                max2 = nums[i];
            }
        }
        
        if(max2 * 2 <= max1) {
            return res;
        }
        
        return -1;
    }
}