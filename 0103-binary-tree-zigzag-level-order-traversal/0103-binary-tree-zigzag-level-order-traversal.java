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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.push(root);
        int c=1;
        while(!dq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            Deque<TreeNode> tempDq = new ArrayDeque<>();
            int size = dq.size();
            for(int i = 0 ; i<size ; i++){
                TreeNode tempNode = dq.pop();
                temp.add(tempNode.val);
                if(c%2==0){
                    if(tempNode.right!=null){
                        tempDq.push(tempNode.right);
                    }
                    if(tempNode.left!=null){
                        tempDq.push(tempNode.left);
                    }
                }
                else{
                    if(tempNode.left!=null){
                        tempDq.push(tempNode.left);
                    }
                    if(tempNode.right!=null){
                        tempDq.push(tempNode.right);
                    }
                }
            }
            dq=tempDq;
            c++;
            res.add(temp);
        }
        return res;
    }
}