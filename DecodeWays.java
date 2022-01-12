class Solution {
    int decodes = 0;
    
    Map<Integer, Integer> map = new HashMap<>();

    public int numDecodings(String s) {
        
        if(s.charAt(0) == '0'){
            return 0;
        }

        if(s.length()>1){
            //check if the fist 2 digits are less than or equal to 26
        decodes = Math.max(decode(0, s), Integer.parseInt(Character.toString(s.charAt(0))+Character.toString(s.charAt(1)))<=26 ? decode(1, s) : 0); 
            
        }else{
            return 1;
        }
        
         return decodes;
    }
    
    public int decode(int idx, String s){
        char[] chars = s.toCharArray();
       
        if(map.containsKey(idx)){
            return map.get(idx) + decodes;
        }
          
        if(idx > s.length()){
            return 0;
        }
        
        if(idx == s.length()-1){
            //means it parsed the whole string
            return ++decodes;
        }
        
        if(idx+1<s.length() && chars[idx+1]!='0'){
         
            
           decodes = Math.max(decode(idx+1, s), idx+2<s.length() &&
                               //no has to be less than 26
                               Integer.parseInt(Character.toString(chars[idx+1])+Character.toString(chars[idx+2]))<=26
                               ? decode(idx+2, s) : 0);
  
        
        }
        
        map.put(idx, decodes);
        
        return decodes;
    }
}
