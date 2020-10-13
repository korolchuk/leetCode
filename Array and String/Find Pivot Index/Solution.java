class Solution {
    public int pivotIndex(int[] nums) {
        int res = -1;
        int sum = 0;
        int sumLeft = 0;
        for(int n : nums) {
            sum += n;
        }
        for(int i = 0; i < nums.length; i++) {
            if (sumLeft == sum - sumLeft - nums[i]) {
                return i;
            }
            sumLeft += nums[i];
        }
        
        return res;
    }
}