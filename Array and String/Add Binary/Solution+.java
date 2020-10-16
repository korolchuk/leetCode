class Solution {
    public String addBinary(String a, String b) {
        int lenA = a.length() - 1;
        int lenB = b.length() - 1;
        String res = "";
        int mem = 0;
        int tmp = 0;
        while(lenA >= 0 || lenB >= 0) {
            tmp = 0;
            if(lenA >= 0) {
                tmp += a.charAt(lenA) - 48;
                lenA--;
            }
            if(lenB >= 0) {
                tmp += b.charAt(lenB) - 48;
                lenB--;
            }
        
            tmp += mem;
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