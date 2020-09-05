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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> res = new ArrayList<>();
        helper(res, root1);
        helper(res, root2);
        Collections.sort(res);
        return res;
    }
    
    public void helper(List<Integer> list, TreeNode root) {
        if(root == null) {
            return;
        }
        list.add(root.val);
        helper(list, root.left);
        helper(list, root.right);  
        return;
    }
}