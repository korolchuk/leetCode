class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        return Math.max(helper(A, B), helper(B, A));
    }
    
    public int helper(int[][] arr1, int[][] arr2) {
        int res = 0;
        int len = arr1.length;
        for(int a = 0; a < len; a++) {
            for(int b = 0; b < len; b++) {
                int tmp = 0;
                for(int i = b; i < len; i++) {
                    for(int j = a; j < len; j++) {
                        if(arr1[i][j] == 1 && arr2[i - b][j - a] == 1) {
                            tmp++;
                        }
                    }
                }
                res = Math.max(res, tmp);
            }
        }
        return res;
    }
}