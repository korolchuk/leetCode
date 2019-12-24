class Solution {
    public void rotate(int[] nums, int k) {
        int steps = k % nums.length;
        int[] tmp = new int[nums.length];
        for(int i = 0; i < steps; i++) {
            tmp[i] = nums[i + nums.length - steps];
        }
        for(int i = 0; i < nums.length - steps; i++) {
            tmp[steps + i] = nums[i];
        }
        
        System.arraycopy(tmp, 0, nums, 0, nums.length); 
        
    }
}