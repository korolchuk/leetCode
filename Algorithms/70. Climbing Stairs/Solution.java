class Solution {
    public int climbStairs(int n) {
        int steps = 0;
        int lastSteps = 1;
        int beforeLastSteps = 0;
        for (int i = 1; i <= n; i++) {
            steps = lastSteps + beforeLastSteps;
            beforeLastSteps = lastSteps;
            lastSteps = steps;
        }
        return steps;
    }
}