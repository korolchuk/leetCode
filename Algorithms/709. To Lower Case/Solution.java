class Solution {
    public String toLowerCase(String str) {
        String res = "";
        for(char l : str.toCharArray()) {
            if (65 <= l & l <= 90) {
                l += 32;
            } 
            res += l;
        }
        return res;
    }
}