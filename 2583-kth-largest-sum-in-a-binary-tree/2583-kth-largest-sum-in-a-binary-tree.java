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
import java.util.*;
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        ArrayList <Long> list = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            long sum=0;
            for(int i=0 ; i<size ; i++){
                TreeNode curr = q.poll();
                sum+=curr.val;
                if(curr.left!=null)q.offer(curr.left);
                if(curr.right!=null)q.offer(curr.right);
            }
            list.add(sum);
        }
        
        Collections.sort(list);
        int size=list.size();
        if(k>size)return -1;
        long lar=list.get(size-k);
        return lar;
        
    }
}