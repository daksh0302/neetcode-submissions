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
    public int maxDepth1(TreeNode root,int count) {
        if(root==null){
            return count;
        }
        int left = maxDepth1(root.left,count+1);
        int right = maxDepth1(root.right,count+1);
        return  Math.max(left,right);
    }
     public int maxDepth(TreeNode root) {
      return  maxDepth1(root,0);
        
    }
}
