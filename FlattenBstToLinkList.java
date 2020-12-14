import java.util.Stack;


/**
 * Flatten Binary Tree to Linked List LeetCode
 */

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

public class FlattenBstToLinkList {

    Stack<TreeNode> stack = new Stack<>();
    public void flatten(TreeNode root) {
        helper(root);

    }

    public void helper(TreeNode root){
        if(root==null){
            return;
        }

        if(root.right!=null){
            stack.push(root.right);
        }

        if(root.left!=null){
            root.right=root.left;
            helper(root.right);
        }

        root.left=null;
        while(!stack.empty()){
            root.right=stack.pop();
            helper(root.right);
            root=root.right;
        }
    }



}
