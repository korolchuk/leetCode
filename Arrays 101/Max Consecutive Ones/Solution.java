class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int tmp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                res = Math.max(res, ++tmp);
            } else {
                tmp = 0;
            }
        }
        
        return res;
    }
}