class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        for(char l : s.toCharArray()) {
            if (l == 'L') {
                balance++;
            } else {
                balance--;
            }
            if (balance == 0) {
                count++;
            }
        }
        return count;
    }
}