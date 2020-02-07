class Solution {
    public int countPrimes(int n) {
        int[] arr = new int[n];
        int count = 0;
        for(int i = 2; i < n; i++) {
            if (arr[i] == 0) {
                count++;
                for(int j = 2; j * i < n; j ++) {
                    arr[j * i] = 1;
                }
            }
            
        }
        
        return count;
    }
}