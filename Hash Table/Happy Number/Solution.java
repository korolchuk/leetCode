class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1) {
            n = helper(n);
            if (set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        
        return true;
    }
    private int helper(int n) {
        int sum = 0;
        while(n > 0) {
            int tmp = n % 10;
            sum += tmp * tmp;
            n = n / 10;
        }
        return sum;
    }
}