class Solution {
    public String convertToTitle(int n) {
        String res = "";
        int countLettres = 0;
        int tmp = 0;
        int lettre = 0;
        
        while(tmp < n) {
            tmp += 26 * Math.pow(26, countLettres);
            countLettres++;
        }
        
        for(int i = countLettres - 1; i >= 0; i--) {
            lettre = n / ((int)Math.pow(26, i));
            if (n % 26 == 0 && n != 26) {
                lettre--;
            }
             
            res += (char)(lettre + 64);
            n -=  lettre * Math.pow(26, i);

        }

        return res;
    }
}