class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int len = nums.length / 3;
        int num1, num2, count1, count2;
        num1 = num2 = count1 = count2 = 0;
        for(int n : nums) {
            if(n == num1) {
                count1++;
            } else if (n == num2) {
                count2++;
            } else if (count1 == 0) {
                num1 = n;
                count1++;
            } else if (count2 == 0) {
                num2 = n;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int n : nums) {
            if (n == num1) {
                count1++;
            }
            if (n == num2) {
                count2++;
            } 
        }
        if(count1 > len) {
            res.add(num1);
        }
        if(count2 > len && num1 != num2) {
            res.add(num2);
        }
        
        return res;
    }
}