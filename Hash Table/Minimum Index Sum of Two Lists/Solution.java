class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        int minSum = Integer.MAX_VALUE;
        List<String> list = new ArrayList<>();
        for(int i = 0; i < list1.length; i++) {
            map.put(list1[i], -i - 1);
        }
        for(int i = 0; i < list2.length; i++) {
            if (map.containsKey(list2[i])){
                minSum = Math.min(minSum,i - map.get(list2[i]));
                map.put(list2[i], i - map.get(list2[i]));
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() == minSum) {
                list.add(entry.getKey());
            }
        }
        String[] res = new String[list.size()];
        return list.toArray(res); 
    }
}