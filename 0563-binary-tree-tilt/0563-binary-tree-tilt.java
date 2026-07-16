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
    int totalTilt=0;
    public int findTilt(TreeNode root) {
        dfs(root);
        return totalTilt;
    }
    public int dfs(TreeNode root){
        if(root==null)return 0;
        int leftsum=dfs(root.left);
        int rightsum=dfs(root.right);
        totalTilt+=Math.abs(leftsum-rightsum);
        return leftsum+rightsum+root.val;
    }
}