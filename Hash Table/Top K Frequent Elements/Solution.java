class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        
        for (Integer key : map.keySet()) {
            int freq = map.get(key);
            List<Integer> list = null;
            if(bucket[freq] == null) {
                list = new ArrayList<>();   
            } else {
                list = bucket[freq];  
            }
            list.add(key); 
            bucket[freq] = list;
        }
        
        List<Integer> tmp = new ArrayList<>();
        for(int i = bucket.length - 1; tmp.size() < k && i >= 0; i--) {
            if (bucket[i] != null) {
               tmp.addAll(bucket[i]); 
            } 
        }
        
        int[] res = new int[tmp.size()];
        for(int i = 0; i < tmp.size(); i++) {
            res[i] = tmp.get(i);
        }
        
        return res;

    }
}