class Solution {
    public boolean wordPattern(String pattern, String str) {
        boolean res = true;
        String[] arr = str.split(" ");
        if(pattern.length() != arr.length) {
            return false;
        }
        Map<Character,String> map = new HashMap<>();
        
        for(int i = 0; i < arr.length; i++) {
            map.putIfAbsent(pattern.charAt(i), arr[i]);
            if (map.containsValue(arr[i])) {
                for (Map.Entry<Character, String> entry : map.entrySet()) {
                    Character k = entry.getKey();
                    String v = entry.getValue();
                    if(arr[i].equals(v)) {
                        if (k != pattern.charAt(i)) {
                            return false;
                        }    
                    }  
                }
            } else {
                return false;
            }
        }
        
        return res;
    }
}