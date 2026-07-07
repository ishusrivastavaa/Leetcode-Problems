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
    public boolean isSymmetric(TreeNode root) {
        // if(root==null){
        //     return true;
        // }
        TreeNode root1 = root.left;
        TreeNode root2 = root.right;
        boolean result = checkSymmetry(root1,root2);
        
        return result;
    }
    public boolean checkSymmetry(TreeNode root1 , TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val != root2.val){
            return false;
        }
        
        boolean p1 = checkSymmetry(root1.left , root2.right);
        boolean p2 = checkSymmetry(root1.right , root2.left);
        if(p1&&p2){
            return true;
        }
        return  false;
    }
}