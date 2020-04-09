class Solution {
    public boolean backspaceCompare(String S, String T) {
        
        return resString(S).equals(resString(T));
    }
    
    private String resString(String s) {
        int bs = 0;
        String res = "";
        for (int i = s.length() - 1 ; i >= 0; i--) {
            if(s.charAt(i) == '#') {
                bs++;
            } else {
                if (bs == 0) {
                    res = s.charAt(i) + res;
                } else {
                    bs--;
                }
            }
		}
        
        return res;
    }
}