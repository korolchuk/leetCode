class Solution {
    public int titleToNumber(String s) {
        char[] str = s.toCharArray();
        int res = 0;
        for(int i = 0; i < str.length; i++) {
            res+= Math.pow(26, str.length - i - 1) * (str[i] - 64);
        }
        
        return res; 
    }
}