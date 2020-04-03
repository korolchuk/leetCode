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
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (L <= root.val && root.val <= R ) {
            res += root.val;
        } 

        res += rangeSumBST(root.left, L, R);
        res += rangeSumBST(root.right, L, R);
        
        return res;
    }
}