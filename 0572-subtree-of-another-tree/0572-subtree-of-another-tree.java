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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        boolean isflag=false;
        if(root==null)return false;
        if(root.val==subRoot.val){
            isflag= checkSymmetry(root,subRoot);
            
        }
         return isSubtree(root.left , subRoot)||
        isSubtree(root.right , subRoot)
       || isflag;
    }
    public boolean checkSymmetry(TreeNode root , TreeNode subRoot){
        if(root==null && subRoot==null)return true;
        else if(root==null || subRoot==null)return false;
        else if(root.val!=subRoot.val)return false;
        boolean leftcheck=checkSymmetry(root.left,subRoot.left);
        boolean rightcheck=checkSymmetry(root.right,subRoot.right);
        return leftcheck && rightcheck;
    }
}