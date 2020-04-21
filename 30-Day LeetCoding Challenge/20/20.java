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
    int i = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) {
            return null;
        }
        
        TreeNode res = helper(preorder, Integer.MAX_VALUE);

        return res;
        
    }
    
    public TreeNode helper(int[] arr, int val) {
        if(arr.length == i || arr[i] > val) {
            return null; 
        }
        TreeNode root = new TreeNode(arr[i++]);
        root.left = helper(arr, root.val);
        root.right = helper(arr, val);

        return root;
        
    }
}