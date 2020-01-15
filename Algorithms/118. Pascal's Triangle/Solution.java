class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();
        if (numRows == 0) {
            return triangle;
        }
        List<Integer> line0 = new ArrayList<Integer>();
        line0.add(1);
        triangle.add(line0);
        for(int i = 1; i < numRows; i++) {
            List<Integer> line = new ArrayList<Integer>();
            line.add(1);
            for(int j = 1; j < i; j++ ) {
                int tmp = triangle.get(i - 1).get(j) + triangle.get(i - 1).get(j - 1);
                line.add(tmp);
            }
            line.add(1);
            triangle.add(line);
        }
        
        return triangle;
    }
}