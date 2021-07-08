class Solution {
    
    List<String> result = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        
        
        recursive(n,n,"");
        
        return result;
        
        
    }
    
    public void recursive(int open, int close, String str){
        
        if(open == 0 && close == 0){
            result.add(str);
        }
        
        if(open<close){
            if(open>0){
                recursive(open-1, close, str+"(");
            }
            if(close>0){
                recursive(open, close-1, str+")");
            }
        }else{
            if(open>0){
                recursive(open-1, close, str+"(");
            }
        }
        
    }
}
