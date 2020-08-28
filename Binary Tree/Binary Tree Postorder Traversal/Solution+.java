/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.empty()){
            TreeNode tmp = stack.pop();
            res.add(tmp.val);
            if(tmp.left != null) {
                stack.add(tmp.left);
            }
            if(tmp.right != null) {
                stack.add(tmp.right);
            }
        }
        Collections.reverse(res);
        return res;
    }
    
    
    
}