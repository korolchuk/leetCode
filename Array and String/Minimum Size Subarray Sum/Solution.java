class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE;
        int sum  = 0;
        for(int i = 0; i < nums.length; i++) {
            int j = i;
            sum = 0;
            while(j < nums.length) {
                sum += nums[j];
                j++;
                if ( sum >= s) {
                    res = Math.min(res, j - i);
                }
            }
        }
        
        if(res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }
}