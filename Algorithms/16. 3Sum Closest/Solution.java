class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[nums.length - 1];
        for(int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            
            while(start != end) {
                int tmp = nums[i] + nums[start] + nums[end];
                if (target - tmp == 0) {
                    return target;
                }
                if (tmp > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(target - res) > Math.abs(target - tmp)) {
                    res = tmp;
                }
            }
        }
        return res;
    }
}