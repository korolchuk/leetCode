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
    private int max = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {

        maxDiameter(root);
        return max;
        
    }
    
    private int maxDiameter(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = maxDiameter(root.left);
        int r = maxDiameter(root.right);
        max = Math.max(max, l + r);
        return Math.max(l, r) + 1;
    }
}