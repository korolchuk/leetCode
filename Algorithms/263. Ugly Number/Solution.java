class Solution {
    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        
        if (num == 1) {
            return true;
        }
        
        num = helper(num, 2);
        num = helper(num, 3);
        num = helper(num, 5);
        
        if(num == 1) {
            return true;
        }
            return false;
    }
    
    private int helper(int num, int dev) {
        while(num % dev == 0) {
            num /= dev;
        }
        
        return num;
    }
}