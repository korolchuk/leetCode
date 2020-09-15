class Solution {
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int index = str.lastIndexOf(" ");
        if (index == -1) {
            return Math.max(0, str.length());
        }
        
        return str.substring(index + 1).length();  
    }
}