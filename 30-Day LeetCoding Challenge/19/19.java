class Solution {
    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        int pos = 0;
        
        while(start < end) {
            pos = (end - start) / 2 + start;
            if (nums[pos] > nums[end] ) {
                start = pos + 1;
            } else {
                end = pos;
            }
        }
        System.out.println(start);
         
        if(target <= nums[nums.length - 1]) {
            return Math.max(Arrays.binarySearch(nums, start, nums.length, target), -1);
        } else {
            return Math.max(Arrays.binarySearch(nums, 0, start, target), -1);
        }
    }
}