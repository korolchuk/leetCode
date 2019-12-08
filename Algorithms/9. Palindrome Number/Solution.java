class Solution {
    public boolean isPalindrome(int x) {
        String[] number = Integer.toString(x).split("");
        if (x < 0) {
            return false;
        }
        for(int i = 0; i <= number.length / 2; i++) {
            if (!number[i].equals(number[number.length - i - 1])) {
                return false;
            }
        }
        return true;
    }
}