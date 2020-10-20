class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int sum  = 0;
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while(sum >= s) {
                res = Math.min(res, i - j + 1);
                sum -= nums[j];
                j++;
            }
        }
        
        if(res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }
}