class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        String strM = Integer.toBinaryString(m);
        String strN = Integer.toBinaryString(n);
        String res = "";
        int dif = strN.length() - strM.length();
        
        
        for(int i = 0; i < dif; i++) {
            strM = "0" + strM;
        }
        Boolean flag = true;
        for(int i = 0; i < strN.length(); i++) {
            if (flag == true) {
                if (strM.charAt(i) == strN.charAt(i)) {
                    res += strM.charAt(i);
                    continue;
                } else {
                    res += "0";
                    flag = false;
                }
            } else {
                res += "0";
            }
            
        }
        
        return Integer.parseInt(res, 2);
    }
}