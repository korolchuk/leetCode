class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        for(int i = len; i >= 0; i--) { 
            if (digits[i] + 1 != 10) {
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                digits[i] = 0;
                if (i == 0) {
                    int res[] = new int[len + 2];
                    res[0] = 1;
                    return res;
                }
            }   
        }
        return digits;
    }
}