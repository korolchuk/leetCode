class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < nums.length; i += 2) {
            for(int j = 0; j < nums[i]; j++) {
                tmp.add(nums[i + 1]);
            }
        }
        int[] res = new int[tmp.size()]; 
        
        for(int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        } 
        
        return res;
    }
}