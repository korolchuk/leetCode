class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int[] dif = new int[gas.length];
        for(int i = 0; i < gas.length; i++) {
            dif[i] = gas[i] - cost[i];
            tank += dif[i];
        }
        
        if(tank < 0) {
            return -1;
        } 
        
        for(int i = 0; i < dif.length; i++) {
            if(dif[i] >= 0) {
                
                int j = 0;
                int k = i;
                int tmp = 0;
                while(j != dif.length) {
                    if(k == dif.length) {
                        k = 0;
                    }
                    tmp += dif[k];
                    if(tmp < 0) {
                        break;
                    }
                    j++;
                    k++;
                }
                if(tmp >= 0) {
                    return i;
                }
                    
            }
        }
        
        return -1;
    }
}