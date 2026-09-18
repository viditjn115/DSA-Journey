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
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> dq = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        dq.offer(root);
        while(!dq.isEmpty()){
            int size = dq.size();
            List<Integer> temp = new ArrayList<>();
            for(int i =0;i<size;i++){
                Node tempNode = dq.poll();
                temp.add(tempNode.val);
                if(tempNode.children!=null){
                    for(Node node:tempNode.children){
                        dq.offer(node);
                    }
                }
            }
            res.add(temp);
        }
        return res;
    }
}