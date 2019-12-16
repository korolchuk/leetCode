class Solution {
    public int maxSubArray(int[] nums) {
       int curMax = nums[0];
       int maxSoFar = nums[0];
       for(int i = 1; i < nums.length; i++) {
           curMax = Math.max(nums[i], curMax + nums[i]);
           maxSoFar =  Math.max(curMax, maxSoFar);
       }
       return maxSoFar; 
    }
}