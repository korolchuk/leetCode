class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
       int tmp = left; 
       List<Integer> res = new ArrayList<>();
       for(int num = left; num <= right; num++) {
           boolean isDevisible = true;
           tmp = num;
           while(tmp > 0) {
               if ((tmp % 10) != 0 && num % (tmp % 10) == 0) {
                   tmp = tmp / 10;
               } else {
                   isDevisible = false;
                   break;
               }
           }

           if (isDevisible) {
               res.add(num);
           }
       }
        return res;
    }
    

}