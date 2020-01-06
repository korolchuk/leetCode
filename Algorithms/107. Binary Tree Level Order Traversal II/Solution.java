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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        int depth = maxDepth(root);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for(int i = depth; i > 0; i--) {
            List<Integer> list = new ArrayList<Integer>();
            res.add(treeNodeToList(root, i, list));
        }
        return res;
    }
    private List<Integer> treeNodeToList(TreeNode root, int level, List<Integer> list) {
        
        if (root == null) {
            return null;
        } else if (level == 1) {
            list.add(root.val);
        } else if (level > 1) {
            treeNodeToList(root.left, level - 1, list);
            treeNodeToList(root.right, level - 1, list);
        }
        return list;
    }
    
    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left) + 1;
            int rightDepth = maxDepth(root.right) + 1;
            return Math.max(leftDepth, rightDepth);
        }
    }
}