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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isMirror(root, root);
    }
    
    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if(n1 == null && n2 == null) {
            return true;
        } 
        
        if(n1 != null && n2 != null && n1.val == n2.val) {
            return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);
        }
        return false;
    }
}