class Solution {
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
    public void helper(char[] s, int l, int r) {
        if(l > r) {
            return;
        }
        char tmp = s[l];
        s[l] = s[r];
        s[r] = tmp;
        l++;
        r--;
        helper(s, l, r);
        return;
    }
}