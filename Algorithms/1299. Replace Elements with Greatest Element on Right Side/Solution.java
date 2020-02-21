class Solution {
    public int[] replaceElements(int[] arr) {
        int tmp = arr[arr.length - 1];
        for(int i = arr.length - 2; i >= 0; i--) {
            if (tmp < arr[i]) {
                int cur = arr[i];
                arr[i] = tmp;
                tmp = cur;
            } else {
                arr[i] = tmp;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}