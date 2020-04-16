class Solution {
    public boolean checkValidString(String s) {
        int lmin = 0;
        int lmax = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lmin++;
                lmax++;
            } else if ((s.charAt(i) == '*')) {
                lmin = Math.max(lmin - 1, 0);
                lmax++;
            } else {
                lmin = Math.max(lmin - 1, 0);
                lmax--;
                
            }
            
            if (lmax < 0) {
            return false;
            } 
        }
              
        if (lmin == 0) {
            return true;
        }
        return false;
    }
}