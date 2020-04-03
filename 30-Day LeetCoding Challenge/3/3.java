class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int tmp = nums[0];

        for(int i = 1; i < nums.length; i++) {
            tmp = Math.max(tmp + nums[i], nums[i]);
            res = Math.max(res, tmp);
        }
        
        return res;
    }
}