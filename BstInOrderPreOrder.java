import java.util.HashMap;
import java.util.Map;

/**
 * Construct Binary Tree from Preorder and Inorder Traversal
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

    TreeNode root=null;

    Map<Integer,Integer> inorderMap=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {


        if(preorder.length ==0|| inorder.length==0){
            return null;
        }

        for(int i=0;i<inorder.length;i++){
            inorderMap.put(inorder[i],i);
        }

        createTree(root,preorder[0]);

        for(int i=1;i<preorder.length;i++){

            createTree(root,preorder[i]);
        }

        return root;

    }

    int findIndex(int val){
        return inorderMap.get(val);
    }

    public void createTree(TreeNode current, int val){

        if(current==null){
            TreeNode node = new TreeNode(val);
            root=node;
            return;
        }

        int currentValIndex = findIndex(current.val);
        int valIndex = findIndex(val);

        if(currentValIndex>valIndex){
            if(current.left!=null){
                createTree(current.left,val);
            }else{
                TreeNode node = new TreeNode(val);
                current.left=node;
            }


        }else{
            if(current.right!=null){
                createTree(current.right,val);
            }else{
                TreeNode node = new TreeNode(val);
                current.right=node;
            }
        }

    }
}
