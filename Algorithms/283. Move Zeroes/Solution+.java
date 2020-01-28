class Solution {
    public void moveZeroes(int[] nums) {
        int marker = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if (i != marker) {
                    nums[marker] = nums[i];
                }
                marker++;
            }
        }
        
        for(int j = marker; j < nums.length; j++) {
            nums[j] = 0;
        }
    }
}