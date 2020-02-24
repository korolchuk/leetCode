class Solution {
    public int repeatedNTimes(int[] A) {
        Set<Integer> set = new HashSet<>();
        for(int a : A) {
            if (set.contains(a)) {
                return a;
            } else {
                set.add(a);
            }
        }
        return -1;
    }
    
}