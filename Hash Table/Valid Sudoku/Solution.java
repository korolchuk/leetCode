class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> list = new ArrayList<>();
        for(int i = 0; i < 9; i++) {
            Set<Character> setRow = new HashSet<>();
            Set<Character> setCol = new HashSet<>();
            if(i % 3 == 0) {

                for(int k = 0; k < 3; k++) {
                    Set<Character> s = new HashSet<>();
                    list.add(k, s);
                } 
            }
            
            for(int j = 0; j < 9; j++) {
                int block = j / 3;
                if(setRow.contains(board[i][j]) || setCol.contains(board[j][i]) 
                   || list.get(block).contains(board[i][j])) {
                    return false;
                }
                if (board[i][j] != '.') {
                    setRow.add(board[i][j]);
                }
                if (board[j][i] != '.') {
                    setCol.add(board[j][i]);
                }
                
                if (board[i][j] != '.') {
                    list.get(block).add(board[i][j]);
                }
                
            }
        }
        
        return true;
    }
}