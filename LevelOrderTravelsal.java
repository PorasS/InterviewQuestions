class Solution {
    Queue<TreeNode> queue = new LinkedList<>();
    List<List<Integer>> resList = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        if(root==null){
            return resList;
        }
        
        List<Integer> list = new ArrayList<>();
        if(root.left==null && root.right==null){
            list.add(root.val);
            resList.add(list);
            return resList;
        }
          
        bfs(root);
        
        return resList;
        
    }
    
    public void bfs(TreeNode root){
       
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            for(int i = 0; i<len;i++){
                TreeNode node = queue.remove();
                list.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            
            resList.add(list);
            
        }
       
    }

}
