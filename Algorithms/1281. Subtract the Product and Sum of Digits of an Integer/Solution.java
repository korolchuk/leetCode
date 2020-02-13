class Solution {
    public int subtractProductAndSum(int n) {
        int sumN = 0;
        int multN = 1;
        while(n != 0) {
            int tmp = n % 10;
            sumN += tmp;
            multN *= tmp;
            n = n / 10; 
        }
        return multN - sumN;
    }
    
}