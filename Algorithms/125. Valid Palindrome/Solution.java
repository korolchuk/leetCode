class Solution {
    public boolean isPalindrome(String s) {
        boolean res = true;
        String str = s.replaceAll("\\s*\\W*", "").toLowerCase();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                return false;
            }
        }
        return res;
    }
}