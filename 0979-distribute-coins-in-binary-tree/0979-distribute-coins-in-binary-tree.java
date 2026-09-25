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
    int steps=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return steps;
    }
    public void dfs(TreeNode root){
        if(root.left==null && root.right==null){
            return;
        }
        if(root.left!=null){
            dfs(root.left);
            root.val+=root.left.val-1;
            steps+=Math.abs(root.left.val-1);
        }
        if(root.right!=null){
            dfs(root.right);
            root.val+=root.right.val-1;
            steps+=Math.abs(root.right.val-1);
        }
    }
}