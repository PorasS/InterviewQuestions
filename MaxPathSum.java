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
    int res = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        
        if(root.left==null && root.right==null){
            return root.val;            
        }
        
        int val = maxSum(root);
         
        return Math.max(res,val);
    }
    
    public int maxSum(TreeNode root){
        if(root==null){
            return 0;
        }
        res = Math.max(res,root.val);
        if(root.left == null && root.right==null){
           return root.val;
        }        
        int l = maxSum(root.left);
        int r = maxSum(root.right);
        l = Math.max(l,0);
        r = Math.max(r,0);
        res = Math.max(res,(l+r+root.val));
        return Math.max(l,r)+root.val;
    }
}
