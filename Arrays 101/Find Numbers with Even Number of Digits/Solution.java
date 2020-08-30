class Solution {
    public int findNumbers(int[] nums) {
        int res = 0;
        for(int num : nums) {
            if (num / 10 <= 9 && num / 10 > 0) {
                res++;
            }
            if (num / 1000 <= 9 && num / 1000 > 0) {
                res++;
            }
            if (num == 100000) {
                res++;
            }
        }
        
        return res;
    }
}