class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length - 1;
        for(int i = 2; i <= len; i++) {
            cost[i] += Math.min(cost[i - 2],cost[i - 1]);
        }
        return Math.min(cost[len - 1], cost[len]);
    }
}