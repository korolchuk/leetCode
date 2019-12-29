class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int first = 0;
        int last = numbers.length - 1;
        while(first < last) {
            if (numbers[last] + numbers[first] == target) {
                return new int[]{first + 1, last + 1};
            } else if (numbers[last] + numbers[first] > target) {
                last--;
            } else if (numbers[last] + numbers[first] < target) {
                first++;
            }
        }
        return null;
    }
}