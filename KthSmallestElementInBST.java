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
    List<Integer> array = new ArrayList<>();
  
    public int kthSmallest(TreeNode root, int k) {

        inorder(root,k-1);
    
        return array.get(k-1);
        
    }
    
    public void inorder(TreeNode node,int k){
        if(node==null){
        return;
        }
        
        if(k<array.size()){
            return;
        }
      
        inorder(node.left,k);
        array.add(node.val);
        inorder(node.right,k);   
    }
}
