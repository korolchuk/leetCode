class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int sumGas = 0;
        int sumCost = 0;
        int res = 0;
        for(int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            sumGas += gas[i];
            sumCost += cost[i];
            if (tank < 0) {
                tank = 0;
                res = i + 1;
            }
        }
        
        if(sumGas - sumCost < 0) {
            return -1;
        } 
        
        return res;
        
    }
}