class Solution {
    public int strStr(String haystack, String needle) {
        int lenH = haystack.length();
        int lenN = needle.length();
        
        if (needle.equals(haystack)) {
            return 0;
        }
        if (lenN == 0) {
            return 0;
        }

        for(int i = 0; i < lenH; i++) {
            if(lenH - i < lenN) {
                break;
            }
            if(haystack.charAt(i) == needle.charAt(0)) {
                int j = 0;
                for(j = 0; j < lenN; j++) {
                    if(haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                }
                if (j == lenN) {
                    return i;
                }
            }

            
        }
        return -1;
    }
}