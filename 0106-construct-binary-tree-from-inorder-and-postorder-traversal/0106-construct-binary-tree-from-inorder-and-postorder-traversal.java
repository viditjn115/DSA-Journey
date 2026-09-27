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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode (postorder[postorder.length-1]);
        TreeNode curr = root;
        Deque<TreeNode> dq = new ArrayDeque<>();
        int j = inorder.length-1;
        dq.push(root);
        for(int i =postorder.length-2 ; i>=0 ; i--){
            TreeNode temp = new TreeNode(postorder[i]);
            
            if(curr.val!=inorder[j]){
                curr.right = temp;
                
            }
            else{
                while(!dq.isEmpty() && dq.peek().val==inorder[j]){
                    curr=dq.pop();
                    j--;
                }
                curr.left = temp;
                
            }
            dq.push(temp);
            curr=temp;
        }
        return root;
    }
}