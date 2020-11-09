class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int a : A) {
            for(int b : B ) {
                int sum = a + b;
                if(map.containsKey(sum)) {
                    map.put(sum, map.get(sum) + 1);
                } else {
                    map.put(sum, 1);
                }
            }
        }
        
        for(int c : C) {
            for(int d : D ) {
                int sum = -(c + d);
                if(map.containsKey(sum)) {
                    res += map.get(sum);
                }
            }
        }
        return res;
    }
}