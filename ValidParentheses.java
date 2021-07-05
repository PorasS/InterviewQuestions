class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>(); 
        
        if(s.charAt(0) == '}' || s.charAt(0) == ']' || s.charAt(0) == ')'){
            return false;
        }
        
        for(int i=0; i<s.length();i++){
            
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else{
                if(!stack.empty()){
                    char topChar = stack.peek();
                    if((s.charAt(i)==')' && topChar == '(')||(s.charAt(i)=='}' && topChar == '{')||(s.charAt(i)==']' && topChar == '[')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else{
                   if(s.charAt(i) == '}' || s.charAt(i) == ']' || s.charAt(i) == ')'){
                         return false;
                     }
                }    
            }
        }
        
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
        
    }
}
