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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        int leftValue=0;
        while(!dq.isEmpty()){
            int size = dq.size();
            for(int i =0 ; i<size ; i++){
                TreeNode temp = dq.poll();
                if(i==0){
                    leftValue=temp.val;
                }
                if(temp.left!=null){
                    dq.offer(temp.left);
                }
                if(temp.right!=null){
                    dq.offer(temp.right);
                }
            }
        }
        return leftValue;
    }
}