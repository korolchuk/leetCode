class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) {
            return res;
        }
        
        List<Integer> tmp = new ArrayList<>();
        tmp.add(1);
        res.add(new ArrayList<>(tmp));
        for(int i = 1; i < numRows; i++) {
            for(int j = i - 1; j >= 1; j--) {
                tmp.set(j, tmp.get(j) + tmp.get(j - 1));
            }
            tmp.add(1);
            res.add(new ArrayList<>(tmp));
        }
        
        return res;
    }
}