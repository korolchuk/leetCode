class Solution {
    public String addBinary(String a, String b) {
        int maxLen = Math.max(a.length(), b.length());
        for(int i = a.length(); i < maxLen; i++) {
            a = "0" + a;
        }
        for(int i = b.length(); i < maxLen; i++) {
            b = "0" + b;
        }
        String res = "";
        int mem = 0;
        int tmp = 0;
        for(int i = maxLen - 1; i >= 0; i--) {
            tmp = a.charAt(i) + b.charAt(i) + mem - 96;
            mem = 0;
            if (tmp > 1) {
                mem = 1;
            }
            res = tmp % 2 + res;  
        }
        
        if(mem != 0) {
            return mem + res;
        }
        
        return res;
    }
}