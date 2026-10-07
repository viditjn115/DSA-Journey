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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode curr = root;
        while(curr!=null){
            if(curr.val>val){
                if(curr.left==null){
                    break;
                }
                curr=curr.left;
            }
            else{
                if(curr.right==null){
                    break;
                }
                curr=curr.right;
            }
        }
        if(curr.val>val){
            curr.left=new TreeNode(val);
        }
        else{
            curr.right = new TreeNode(val);
        }
        return root;
    }
}