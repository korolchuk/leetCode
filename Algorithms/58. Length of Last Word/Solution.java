class Solution {
    public int lengthOfLastWord(String s) {
        String trimedString = s.trim();

        return  trimedString.length() - trimedString.lastIndexOf(" ") - 1;
    }
}