class Solution {
    public int maximalSquare(char[][] matrix) {
        int res = 0;
        int n = matrix.length;
        if ( n == 0) {
            return 0;
        }
        int m = matrix[0].length;
        
        int copy[][] = new int[n][m]; 
        
        for(int i = 0; i < n; i++) {
            if (matrix[i][0] == '1') {
                copy[i][0] = 1;
                res = 1;
            } else {
                copy[i][0] = 0;
            }
        }
        
        for(int i = 0; i < m; i++) {
            if (matrix[0][i] == '1') {
                copy[0][i] = 1;
                res = 1;
            } else {
                copy[0][i] = 0;
            }
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if (matrix[i][j] == '1') {
                    copy[i][j] = 1;
                    res = Math.max(res, 1);
                } else {
                    copy[i][j] = 0;
                }
                
                if(copy[i][j] == 1) {
                    if (copy[i - 1][j] > 0 && copy[i][j - 1] > 0 && copy[i - 1][j - 1] > 0 ) {
                        int tmp = Math.min(copy[i - 1][j], copy[i][j - 1]);
                        copy[i][j] = Math.min(tmp, copy[i - 1][j - 1]) + 1;
                        res = Math.max(res, copy[i][j]);
                    }
                }
            }
        }
        
        return res * res;
    }
}