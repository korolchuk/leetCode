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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        Map<String, Integer> map = new HashMap<>();
        List<TreeNode> res = new ArrayList<>();
        helper(root, map, res);
        return res;
    }
    public String helper(TreeNode root, Map<String, Integer> map, List<TreeNode> res) {
        if(root == null) {
            return "X";
        }
        String left = helper(root.left, map, res);
        String right = helper(root.right, map, res);
        String tmp = root.val + "-" +left + "-" + right;
        if(map.containsKey(tmp)) {
            if (map.get(tmp) == 1) {
                res.add(root);
            }
            map.put(tmp, map.get(tmp) + 1);
        } else {
            map.put(tmp, 1);
        }
        return tmp;

    }
}