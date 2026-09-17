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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList();  
        if(root==null){
            return res;
        }
        Queue<TreeNode> dq = new ArrayDeque();
        dq.offer(root);
        while(!dq.isEmpty()){
            int size = dq.size();
            List<Integer> list = new ArrayList<>(); 
            for(int i =0;i<size; i++){
                TreeNode temp = dq.poll();
                if(temp.left!=null){
                    dq.offer(temp.left);
                }
                if(temp.right!=null){
                    dq.offer(temp.right);
                }
            list.add(temp.val);
            }
            res.add(0,list);
        }
        return res;
    }
}