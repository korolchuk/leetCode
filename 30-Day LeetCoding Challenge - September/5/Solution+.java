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
        List<Integer> tmp1 = new ArrayList<>();
        List<Integer> tmp2 = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        helper(tmp1, root1);
        helper(tmp2, root2);
        int i = 0;
        int j = 0;
        while(i != tmp1.size() || j != tmp2.size()) {
            if (i == tmp1.size()) {
                res.add(tmp2.get(j));
                j++;
            }else if (j == tmp2.size()) {
                res.add(tmp1.get(i));
                i++;
            }else if(tmp1.get(i) > tmp2.get(j) ) {
                res.add(tmp2.get(j));
                j++;
            } else {
                res.add(tmp1.get(i));
                i++;
            }
        }

        return res;
    }
    
    public void helper(List<Integer> list, TreeNode root) {
        if(root == null) {
            return;
        }
        helper(list, root.left);
        list.add(root.val);
        helper(list, root.right);  
        return;
    }
}