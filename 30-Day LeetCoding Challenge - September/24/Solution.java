class Solution {
    public char findTheDifference(String s, String t) {
        int len = t.length();
        int sumS = 0;
        int sumT = 0;
        for(int i = 0; i < len; i++) {
            if (i != len - 1) {
                sumS += s.charAt(i);
            } 
            sumT += t.charAt(i);
        }
        
        return (char)(sumT - sumS);
    }
}