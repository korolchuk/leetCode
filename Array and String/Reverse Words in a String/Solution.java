class Solution {
    public String reverseWords(String s) {

        int len = s.length();
        String tmp = "";
        boolean needSpace = false;
        for(int i = len - 1, j = 0; i >= 0; i--) {
            if(s.charAt(i) == 32) {
                if (needSpace) {
                    s = s + " " + tmp;
                    needSpace = false;
                } else {
                    s = s + tmp;
                }
                tmp = "";
            } else {
                tmp = s.charAt(i + j) + tmp;
                needSpace = true;
            }
        }
        if (needSpace) {
            s = s + " " + tmp;
            needSpace = false;
        } else {
            s = s + tmp;
        }
        return s.substring(len + 1); 
    }
}