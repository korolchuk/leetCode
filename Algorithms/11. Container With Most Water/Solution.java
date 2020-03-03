class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int res = 0;
        while(start != end) {
            int tmp = Math.min(height[start], height[end]) * (end - start);
            if (tmp > res) {
                res = tmp;
            }
            if(height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }
        return res;
    }
}