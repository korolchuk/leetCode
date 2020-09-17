class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int mark = 1;
        int res = 0;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[i - 1]) {
                res++;
            } else {
                nums[mark] = nums[i];
                mark++;
            }
        }
        return nums.length - res;
    }
}