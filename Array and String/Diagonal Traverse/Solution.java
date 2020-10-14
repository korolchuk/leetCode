class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return new int[0];
        }
        int n = matrix[0].length;
        int[] res = new int[m * n];
        int row = 0;
        int col = 0;
        for(int i = 0; i < m * n; i++) {
            res[i] = matrix[row][col];
            if((col + row) % 2 == 0) {
                if(col == n - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    col++;
                    row--;
                }
            } else {
                if(row == m - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    col--;
                    row++;
                }
            }
            
        }
        return res;
    }
}