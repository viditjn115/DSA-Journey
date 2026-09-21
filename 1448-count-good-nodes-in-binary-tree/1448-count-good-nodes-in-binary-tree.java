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
    int c=0;
    public int goodNodes(TreeNode root) {
        recursion(root,Integer.MIN_VALUE);
        return c;
    }
    public void recursion(TreeNode root , int max_prev){
        if(root==null){
            return;
        }
        if(root.val>=max_prev){
            c++;
        }
        max_prev=Math.max(max_prev,root.val);
        recursion(root.left,max_prev);
        recursion(root.right,max_prev);
    }

}