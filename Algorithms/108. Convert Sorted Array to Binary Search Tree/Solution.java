/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] arr, int start, int end) {
        if (start > end) {
            return null;
        }
        
        int mid =  (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = helper(arr, start, mid - 1);
        node.right = helper(arr, mid + 1, end);
        
        return node;
    }
}