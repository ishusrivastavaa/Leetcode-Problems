/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if(original==target){
            return cloned;
        }
        if(original==null){
            return null;
        }
        TreeNode left=getTargetCopy(original.left, cloned.left, target);
        if(left!=null){
            return left;
        }
        TreeNode right=getTargetCopy(original.right ,cloned.right , target);
        return right;
        
    }
    
}