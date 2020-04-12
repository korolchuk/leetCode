class Solution {
    public int lastStoneWeight(int[] stones) {
        int len = stones.length;
        if(len == 1) {
            return stones[0];
        }
        
        Arrays.sort(stones);
        
        while(stones[len - 2] != 0) {
            if (stones[len - 1] == stones[len - 2]) {
                stones[len - 1] = 0;
                stones[len - 2] = 0;
            } else {
                int tmp = stones[len - 1] - stones[len - 2];
                stones[len - 2] = tmp;
                stones[len - 1] = 0;
            }
            Arrays.sort(stones);
        }
        
        return stones[len - 1];
    }
}