class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }};
        int sum = 0;
        
        String[] arr = s.split("");
        
        for(int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1) {
                if(map.get(arr[i]) < map.get(arr[i + 1])) {
                    sum -= map.get(arr[i]);
                } else {
                    sum += map.get(arr[i]);
                }
            } else {
                sum += map.get(arr[i]);
            }
        }
        
        return sum;
    }
}