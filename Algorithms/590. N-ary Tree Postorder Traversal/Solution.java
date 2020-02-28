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
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        
        while(!stack.empty()) {
            Node tmp = stack.pop();
            if(tmp != null) {
                res.add(tmp.val); 
                for(Node n : tmp.children){
                    stack.push(n);
                }
            }
        }
        Collections.reverse(res);
        return res;
    }
}