class Solution {
  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {    
        if(root==null && subRoot==null){
            return true;
        }
        
        if(root==null && subRoot!=null){
            return false;
        }
        
        if(sameTree(root,subRoot)){
            return true;
        }
        
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot)?true:false;
    }
    
    
    public boolean sameTree(TreeNode p, TreeNode q){
        
	    if(p==null && q==null){
                return true;
        }
        
        if(p==null || q==null){
                return false;
        }

        if(p.val!=q.val){
            return false;
        }

        if((p.left!=null && q.left==null) || (p.left==null && q.left!=null) 
        || (p.right==null && q.right!=null) || (p.right!=null && q.right==null)){
            return false;
        }

        return sameTree(p.left,q.left)&&sameTree(p.right,q.right)?true:false;

    }

}
