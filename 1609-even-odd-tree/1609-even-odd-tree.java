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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> dq = new LinkedList<>();
        dq.offer(root);
        int index =-1;
        while(!dq.isEmpty()){
            index++;
            int size = dq.size();
            for(int i =0 ; i<size ; i++){
                TreeNode temp = dq.poll();
                if(index%2==0){
                    if(temp.val%2==0 || (i!=size-1 && temp.val>=dq.peek().val)){
                        return false;
                    }
                }
                else{
                    if(temp.val%2!=0 || (i!=size-1 && temp.val<=dq.peek().val)){
                        return false;
                    }
                }
                if(temp.left!=null){
                    dq.offer(temp.left);
                }
                if(temp.right!=null){
                    dq.offer(temp.right);
                }
            }
        }
        return true;
    }
}