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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        while(!dq.isEmpty()){
            List<Integer> temp = new ArrayList<>();
            int size = dq.size();
            for(int i = 0 ; i<size ; i++){
                TreeNode tempNode = dq.poll();
                temp.add(tempNode.val);
                if(tempNode.left!=null){
                    dq.offer(tempNode.left);
                }
                if(tempNode.right!=null){
                    dq.offer(tempNode.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}