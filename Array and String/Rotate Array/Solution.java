class Solution {
    public void rotate(int[] nums, int k) {
        int count = k % nums.length;
        int len = nums.length;
        for(int i = 0, j = len - 1; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        for(int i = 0, j = count - 1; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        for(int i = count, j = len - 1; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}