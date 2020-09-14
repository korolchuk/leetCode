class Solution {
    public int rob(int[] nums) {
        int res = 0;
        if (nums.length == 0) {
            return res;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length >= 2) {
            res =  Math.max(nums[0], nums[1]);
            nums[1] = res;
        }
        for(int i = 2; i < nums.length; i++) {
            res = Math.max(res, nums[i - 2] + nums[i]);
            nums[i] = res;
        }
        
        return res;
    }
}