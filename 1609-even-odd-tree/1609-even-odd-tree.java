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
    public boolean isEvenOddTree(TreeNode root) {
        return levelOrder(root);
    }
    public boolean levelOrder(TreeNode root){
        
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        int level=0;
        
        while(!q.isEmpty()){
            int size = q.size();
            int previousEven = Integer.MIN_VALUE;
            int previousOdd = Integer.MAX_VALUE;
            for(int i=0 ; i<size ; i++){
                TreeNode curr = q.poll();
                if(level%2==0){
                    if(curr.val<=previousEven || curr.val%2==0){
                        return false;
                    }
                    previousEven=curr.val;
                }
                else {
                    if(curr.val>=previousOdd || curr.val%2!=0){
                        return false;
                    }
                    previousOdd=curr.val;
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                
            }
            level++;
        }
        return true;
        
    }
}