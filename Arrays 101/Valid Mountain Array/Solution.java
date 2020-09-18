class Solution {
    public boolean validMountainArray(int[] A) {
        if(A.length < 3) {
            return false;
        }
        int i = 1;
        while (i < A.length - 1 && A[i - 1] < A[i]) {
            i++;
        }
        int j = A.length - 1;
        while (A[j] < A[j - 1] && j > 1) {
            j--;
        }
        
        if (i - j == 1) {
            return true;
        }
        return false;
    }
}