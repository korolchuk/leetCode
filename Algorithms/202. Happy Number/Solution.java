class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>(); 
        int res;
        while (n != 1) {
            res = 0;
            while( n != 0){
                res += Math.pow(n % 10, 2);
                n /= 10;
            }
            
            if(set.contains(res) == true) {
                return false;
            }
            
            set.add(res);
            n = res;
        }
        
        return true;

    }
    
}