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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode (preorder[0]);
        TreeNode curr = root;
        Deque<TreeNode> dq = new ArrayDeque<>();
        int j = 0;
        dq.push(root);
        for(int i =1 ; i<preorder.length ; i++){
            TreeNode temp = new TreeNode(preorder[i]);
            
            if(curr.val!=inorder[j]){
                curr.left = temp;
                
            }
            else{
                while(!dq.isEmpty() && dq.peek().val==inorder[j]){
                    curr=dq.pop();
                    j++;
                }
                curr.right = temp;
                
            }
            dq.push(temp);
            curr=temp;
        }
        return root;
    }
}