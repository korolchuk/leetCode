class Solution {
    public String largestNumber(int[] nums) {
        String[] tmp = new String[nums.length];
        String res = "";
        for(int i = 0; i < nums.length; i++) {
            tmp[i] = String.valueOf(nums[i]);
        }
        
        Arrays.sort(tmp, new Comparator<String>() {
            public int compare(String n1, String n2) {
                return (n2 + n1).compareTo(n1 + n2);
            }
        });
        
        if(tmp[0].equals("0")) {
            return "0";
        }
            
        for(String s : tmp) {
            res += s;
        }
        return res;
    }
}