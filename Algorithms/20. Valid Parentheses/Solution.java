class Solution {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
           return true; 
        }
        
        Stack<String> stack = new Stack<String>();
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("(", 1);
            put(")", -1);
            put("{", 2);
            put("}", -2);
            put("[", 3);
            put("]", -3);
        }};
        
        for(String bracket : s.split("")) {
            if (map.get(bracket) > 0) {
                stack.push(bracket);
            } else {
                if (stack.empty()){
                    return false;
                }
                if( map.get(stack.peek()) == -map.get(bracket)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        
        return stack.empty();
    }
}