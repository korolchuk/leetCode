class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
            
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if(pair.getValue() > len) {
                res.add(pair.getKey());
            };
        }

        return res;
    }
}