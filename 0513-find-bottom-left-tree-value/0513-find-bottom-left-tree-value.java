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
    public int findBottomLeftValue(TreeNode root) {
        return findval(root);
    }
    public int findval(TreeNode root){
        int level =0;
        int val=0;
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            int col=0;
            for(int i=0; i<size ; i++){
                TreeNode curr=q.poll();
                col++;
                if(curr!=null && col==1)val=curr.val;
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
        }
        return val;
    }
}