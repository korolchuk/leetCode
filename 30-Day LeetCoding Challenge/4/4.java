class Solution {
    public void moveZeroes(int[] nums) {
        int ind = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[i - ind] =  nums[i];
            } else {
                ind++;
            }
        }
        
        for(int j = nums.length - ind; j < nums.length; j++) {
            nums[j] = 0;
        }
        
    }
}