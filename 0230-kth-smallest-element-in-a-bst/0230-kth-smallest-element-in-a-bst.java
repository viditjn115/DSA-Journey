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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr = root;
        Deque<TreeNode> dq = new ArrayDeque<>();
        while(curr!=null){
            dq.push(curr);
            curr=curr.left;
        }
        while(!dq.isEmpty()){
            curr=dq.pop();
            k--;
            if(k==0){
                return curr.val;
            }
            else{
                if(curr.right!=null){
                    curr = curr.right;
                    while(curr!=null){
                        dq.push(curr);
                        curr=curr.left;
                    }
                }
            }
        }
        return -1;
    }
}