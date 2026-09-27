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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = new TreeNode(preorder[0]);
        TreeNode curr = root;
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.push(root);
        for(int i = 1 ; i<preorder.length ; i++){
            TreeNode temp = new TreeNode(preorder[i]);

            if(temp.val<curr.val){
                curr.left=temp;
            }
            else{
                while(!dq.isEmpty() && dq.peek().val<temp.val){
                    curr=dq.pop();
                }
                curr.right = temp;
            }
            curr=temp;
            dq.push(temp);
        }
        return root;
    }
}