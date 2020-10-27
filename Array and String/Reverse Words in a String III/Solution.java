class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        char[] arrS = s.toCharArray();
        for(int i = 0; i < arrS.length; i++) {  
            if(arrS[i] == ' ' || i == arrS.length - 1) {
                if(i == arrS.length - 1) {
                    end = i;
                } else {
                    end = i - 1;
                }
                while(start < end) {
                    char tmp = arrS[start];
                    arrS[start] = arrS[end];
                    arrS[end] = tmp;
                    start++;
                    end--;
                }
                start = i + 1;
            }
        }
        return String.valueOf(arrS);
    }
}