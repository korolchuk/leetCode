class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i < j) {
            if(s[i] != s[j]) {
                char tmp = s[j];
                s[j] = s[i];
                s[i] = tmp;
            }
            i++;
            j--;
        }
    }
}