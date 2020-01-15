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
    public boolean isBalanced(TreeNode root) {
        
        if (root == null) {
            return true;
        }
        
        if (bDepth(root) == -1) {
            return false;
        }
        
        return true;
        
    }
    
    private int bDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int dLeft = bDepth(root.left);
        int dRight = bDepth(root.right);
        
        if (dLeft == -1 || dRight == -1 || Math.abs(dLeft - dRight) > 1) {
            return -1;
        }
        
        return Math.max(dLeft, dRight) + 1;
    }
    
}