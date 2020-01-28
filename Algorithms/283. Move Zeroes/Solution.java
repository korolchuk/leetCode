class Solution {
    public void moveZeroes(int[] nums) {
        int marker = nums.length;
        int tmp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                marker = Math.min(marker, i);
            } else {
                if (marker != nums.length) {
                    tmp = nums[i];
                    nums[i] = nums[marker];
                    nums[marker] = tmp;
                    marker++;
                    i = marker;
                }
            }
        }
    }
}