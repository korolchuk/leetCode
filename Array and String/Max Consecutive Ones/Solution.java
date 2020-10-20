class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int tmp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                tmp = 0;
            }else {
                tmp ++;
            }
            res = Math.max(res, tmp);
        }
        return res;
    }
}