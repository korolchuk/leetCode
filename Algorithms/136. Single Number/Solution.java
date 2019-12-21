class Solution {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if (arr.contains(nums[i])) {
                arr.remove((Object)nums[i]); 
            } else {
                arr.add(nums[i]);
            }
        }
        return arr.get(0);
    }
}