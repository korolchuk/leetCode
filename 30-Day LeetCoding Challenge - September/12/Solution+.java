class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> comp = new ArrayList<Integer>();
        helper(res, comp, k, 1, n);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> comb, int k,  int start, int n) {
        if (comb.size() == k && n == 0) {
            List<Integer> l = new ArrayList<Integer>(comb);
            res.add(l);
            return;
        }
        if(comb.size() > k) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            comb.add(i);
            helper(res, comb, k, i+1, n-i);
            comb.remove(comb.size() - 1);
        }
    }
}