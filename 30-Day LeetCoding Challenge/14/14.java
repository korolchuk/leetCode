class Solution {
    public String stringShift(String s, int[][] shift) {
        int tmp = 0;
        for(int[] el : shift) {
            if(el[0] == 0) {
                tmp += el[1];
            } else {
                tmp -= el[1];
            }
        }
        tmp = tmp % s.length();
        
        if(tmp <= 0) {
            return s.substring(s.length() + tmp) + s.substring(0, s.length() + tmp);
        } 
        
        return s.substring(tmp) + s.substring(0, tmp);

    }
}