class Solution {
    public int[] sumZero(int n) {
        int sum = 0;
        int[] res = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (i == 0) {
                res[i] = -sum;
                return res;
            }
            res[i] = i;
            sum += i;
        }
        return res;
    }
}