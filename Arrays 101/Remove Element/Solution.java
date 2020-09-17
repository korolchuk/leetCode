class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int res = 0;
        
        while (i <= j) {
            if (nums[j] == val) {
                j--;
                res++;
            } else if (nums[i] == val) {
                nums[i] = nums[j];
                nums[j] = val;
                res++;
                i++;
                j--;
            } else {
                i++;
            }
        }
        return nums.length - res;
    }
}