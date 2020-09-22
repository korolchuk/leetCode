class Solution {
    public void moveZeroes(int[] nums) {
        int indx = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 ) {
                if(i != indx) {
                    nums[indx] = nums[i];
                }
                indx++;
            }
        }
        Arrays.fill(nums, indx, nums.length, 0);

    }
}