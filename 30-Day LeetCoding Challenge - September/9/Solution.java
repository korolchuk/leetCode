class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int lenV1 = v1.length;
        int lenV2 = v2.length;
        
        for(int i = 0; i < Math.max(lenV1, lenV2); i++) {
            
            int tmp1;
            int tmp2;
            if (i >= lenV1) {
                tmp1 = 0;
            } else {
                tmp1 = Integer.parseInt(v1[i]);
            }
            
            if (i >= lenV2) {
                tmp2 = 0;
            } else {
                tmp2 = Integer.parseInt(v2[i]);
            }

            if (tmp1 > tmp2) {
                return 1;
            } else if (tmp1 < tmp2) {
                return -1;
            }
            
        }

        return 0;
    }
}