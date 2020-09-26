class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 0) {
            return 0;
        }
        int res = duration;
        for(int i = 1; i < timeSeries.length; i++) {
            if(timeSeries[i] - timeSeries[i - 1] > duration) {
                res += duration;
            } else {
                res += timeSeries[i] - timeSeries[i - 1];
            }
        }
        return res;
    }
}