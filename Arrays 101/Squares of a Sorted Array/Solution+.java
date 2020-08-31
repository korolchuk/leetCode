class Solution {
    public int[] sortedSquares(int[] A) {
        int i = 0;
        int j = A.length - 1;
        int[] res = new int[A.length];
        for(int k = j; k >= 0; k--) {
            if(Math.abs(A[i]) > Math.abs(A[j])) {
                res[k] = A[i] * A[i];
                i++;
            } else {
                res[k] = A[j] * A[j];
                j--;
            }
        }
        return res;
    }
}