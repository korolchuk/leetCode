class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int res = -1;
        int lenHaystack =  haystack.length();
        int lenNeedle =  needle.length();
        int count = lenHaystack - lenNeedle;
        for(int i = 0; i <= count; i++) {
            if (needle.equals(haystack.substring(i,i + lenNeedle))) {
                return i;
            }
        }
        return res;
    }
}