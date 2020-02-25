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
    
    public int rangeSumBST(TreeNode root, int L, int R) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int res = 0;
        while(!stack.empty()) {
            TreeNode tmp = stack.pop();
            if(tmp == null) {
                continue;
            }
            stack.push(tmp.left);
            stack.push(tmp.right);
                
            if (L <= tmp.val && tmp.val <= R) {
                res += tmp.val;
            }
        }
        
        return res;
    }
}