class Solution {
    public boolean isValid(String s) {
        
        if(s.length()==1){
            return false;
        }

        Stack<Character> chStack = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch=='{'||ch=='('|| ch=='['){
                chStack.push(ch);
            }else{
                if(chStack.size()==0){
                    return false;
                }
                if((ch==']' && chStack.pop()!='[')
                || (ch=='}' && chStack.pop()!='{') ||
                (ch==')' && chStack.pop()!='(')){
                    return false;
                }
            }
        }
        return chStack.size()>0?false:true;
    }
}
