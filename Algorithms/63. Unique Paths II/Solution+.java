class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
            
        int[][] tmp = new int[obstacleGrid.length][obstacleGrid[0].length];
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        
        tmp[0][0] = 1;
        
        for(int i = 1; i < n; i++) {
            if(obstacleGrid[0][i] == 1) {
                tmp[0][i] = 0;
            } else {
                tmp[0][i] += tmp[0][i - 1];
            }
        }
        
        for(int i = 1; i < m; i++) {
            if(obstacleGrid[i][0] == 1) {
                tmp[i][0] = 0;
            } else {
                tmp[i][0] += tmp[i - 1][0];
            }
        }
        
        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 1) {
                    tmp[i][j] = 0;
                } else {
                    tmp[i][j] = tmp[i - 1][j] + tmp[i][j - 1];
                }
            }
        }
        
        return tmp[m - 1][n - 1];
        
    }
    
}