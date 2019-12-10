class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        String res = "";
        
        if (len == 0) {
            return res;
        }
        
        if (len == 1) {
            return strs[0];
        }
        
        for(int i = 1; i <= strs[0].length(); i++ ) {
            res = strs[0].substring(0, i);
            
            for(int j = 1; j < len; j++) {
                if (strs[j].startsWith(res) == false) {
                    return strs[0].substring(0, i - 1);
                } 
            }
        }
        
        return res;
    }
}