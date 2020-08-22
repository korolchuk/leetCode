class Solution {
    public boolean canJump(int[] nums) {
        int tmp = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if (tmp == 0) {
                return false;
            }
            tmp = Math.max(nums[i], tmp - 1);
        }
        return true;
    }
}