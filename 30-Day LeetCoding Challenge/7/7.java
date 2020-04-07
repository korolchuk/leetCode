class Solution {
    public int countElements(int[] arr) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int el : arr) {
            set.add(el);
        }
        
        
        for(int el : arr) {
            if(set.contains(el + 1)) {
                res++;
            }
        }
        
        return res;
    }
}