class Solution {
    public int numIslands(char[][] grid) {
        int res = 0;
        int h = grid.length;
        if(h == 0) {
            return res;
        }
        int w = grid[0].length;
        if(w == 0) {
            return res;
        }
        
        
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if(grid[i][j] == '1') {
                    helper(grid, i, j);
                    res++;
                }
            }
        }
        
        return res;

    }
    
    private void helper(char[][] grid, int x, int y) {
        grid[x][y] ='0';
        
        if(x + 1 < grid.length && grid[x + 1][y] == '1') {
            helper(grid, x + 1, y);
        }
        if(x - 1 >= 0 && grid[x - 1][y] == '1') {
            helper(grid, x - 1, y);
        }
        if(y + 1 < grid[0].length && grid[x][y + 1] == '1') {
            helper(grid, x, y + 1);
        }
        if(y - 1 >= 0 && grid[x][y - 1] == '1') {
            helper(grid, x, y - 1);
        }
        
    }
}