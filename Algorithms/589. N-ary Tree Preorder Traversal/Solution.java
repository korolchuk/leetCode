/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>(); 
        stack.add(root);
        
        while(!stack.empty()) {
            Node tmp = stack.pop();
            if(tmp != null) {
                res.add(tmp.val);
                for(int i = tmp.children.size() - 1; i >= 0; i--){
                    stack.add(tmp.children.get(i));
                }
            }
        }
        return res;

    }
}