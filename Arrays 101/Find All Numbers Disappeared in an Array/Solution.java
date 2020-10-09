class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int tmp = Math.abs(nums[i]) - 1;
            if(nums[tmp] > 0) {
                nums[tmp] *= -1;
            }
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                res.add(i + 1);
            }
        }
        return res;
    }
}