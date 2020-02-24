class Solution {
    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length - 1;
        int res[] = new int[A.length];
        int i = 0;
        while(i <  A.length) {
            if (A[start] * A[start] < A[end] * A[end]) {
                res[A.length - i - 1] = A[end] * A[end];
                end--;
            } else {
                res[A.length - i - 1] = A[start] * A[start];
                start++;
            }
            i++;
        }
        return res;
    }
}