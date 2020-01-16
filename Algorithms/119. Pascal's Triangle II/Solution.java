class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> line = new ArrayList<Integer>();
        line.add(1);
        
        if (rowIndex == 0) {
            return line;
        }
        
        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(1);
            for(int j = 1; j < i; j++ ) {
                int tmpVal = line.get(j) + line.get(j - 1);
                tmp.add(tmpVal);
            }
            tmp.add(1);
            line = tmp;
        }
        
        return line;
    }
}