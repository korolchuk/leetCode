class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
            
        int[][] tmp = new int[obstacleGrid.length][];
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        boolean isClosed = false;
            
        if (obstacleGrid[m - 1][n - 1] == 1 || obstacleGrid[0][0] == 1) {
            return 0;
        }
        
        tmp = cloneArray2D(obstacleGrid);
        for(int i = 0; i < n; i++) {
            if(tmp[0][i] == 1) {
                isClosed = true;
            }
            if (isClosed) {
                tmp[0][i] = 0;
            } else {
                tmp[0][i] = 1;
            }
        }
        
        isClosed = false;
        for(int i = 1; i < m; i++) {
            if(tmp[i][0] == 1) {
                isClosed = true;
            }
            if (isClosed) {
                tmp[i][0] = 0;
            } else {
                tmp[i][0] = 1;
            }
        }
        
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(tmp[i][j] == 1) {
                    tmp[i][j] = 0;
                } else {
                    tmp[i][j] = tmp[i - 1][j] + tmp[i][j - 1];
                }
            }
        }
        
        return tmp[m - 1][n - 1];
        
    }
    
    private int[][] cloneArray2D(int[][] arr) {
        int[][] res = new int[arr.length][];
        for(int i = 0; i < arr.length; i++) {
            res[i] = arr[i].clone();
        }
        return res;
    }
}