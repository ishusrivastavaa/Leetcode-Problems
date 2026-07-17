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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        return addOnerow(root,val,depth);
    }
    public TreeNode addOnerow(TreeNode root , int val , int depth){
        if(depth==1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        int d=0;
        while(!q.isEmpty()){
            d++;
            int size=q.size();
            if(d==depth-1){
                for(int i=0 ; i<size ; i++){
                TreeNode curr = q.poll();
                TreeNode leftcurr=curr.left;
                TreeNode rightcurr=curr.right;
                curr.left=new TreeNode(val);
                curr.right=new TreeNode(val);
                curr.left.left=leftcurr;
                curr.right.right=rightcurr;
                }
               
                return root;
            }
            
            for(int i=0 ; i<size ; i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
            
        }
        return root;
    }
}