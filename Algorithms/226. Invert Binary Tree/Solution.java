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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return root;
        }
        
        root.left = invertTree(root.left);
        root.right = invertTree(root.right);
        
        if(root.left != null && root.right != null) {
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
        
        if(root.left == null && root.right != null) {
            root.left = root.right;
            root.right = null;
        } else if (root.right == null && root.left != null) {
            root.right = root.left;
            root.left = null;
        }
        
        return root;
    }
}