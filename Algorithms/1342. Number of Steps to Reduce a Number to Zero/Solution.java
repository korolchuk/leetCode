class Solution {
    public int numberOfSteps (int num) {
        if (num == 0) {
            return 0;
        }
        
        int res = 0;
        while(num != 1) {
            if(num % 2 == 0) {
                num = num / 2;
            } else {
                num = num / 2;
                res++;
            }
            res++;
        }
        
        return ++res;
    }
}