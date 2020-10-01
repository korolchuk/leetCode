class Solution {
    public int heightChecker(int[] heights) {
        int[] copiedHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(copiedHeights);
        int res = 0;
        for(int i = 0; i < heights.length; i++) {
            if (heights[i] != copiedHeights[i]) {
                res++;
            }
        } 
        
        return res;

    }
}