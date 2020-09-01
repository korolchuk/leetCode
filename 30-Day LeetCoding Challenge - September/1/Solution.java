class Solution {
    public String largestTimeFromDigits(int[] A) {
        String res = "";
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++) {
                for(int k = 0; k < A.length; k++) {
                    if(i == j ||  j == k || i == k) {
                        continue;
                    }
                    String hh = Integer.toString(A[i]) + Integer.toString(A[j]);
                    String mm = Integer.toString(A[k]) + Integer.toString(A[6 - i - j - k]);
                    String tmp = hh + ":" + mm;
                    if(hh.compareTo("24") < 0  && mm.compareTo("60") < 0 && tmp.compareTo(res) > 0) {
                        res = tmp;
                    }
                }
            }
        }
        return res;
    }
}