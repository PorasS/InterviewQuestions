class Solution {
    public boolean isPalindrome(String s) {
        
        
        if(s==null || s.length()==0){
            return false;
        }
        
        //remove special char
        //a-z : 97-122
        //0-9 : 48-57
        String palindrome = "";
        for(int i = 0; i<s.length();i++){
            char lc = Character.toLowerCase(s.charAt(i));
            int chValue = (int) lc;
            if((chValue>=97 && chValue<=122) ||(chValue>=48 && chValue<=57)){
                palindrome += lc;
            }      
        }
         
        if(palindrome.length()==1){
            return true;
        }
         
        if(palindrome.length()==2){
            return palindrome.charAt(0)==palindrome.charAt(1)?true:false;
        }
        
        int palLength = palindrome.length()%2;
        
        int l = 0;
        int r = 0;
        
        if(palLength == 0){//even length
            l = (palindrome.length()/2)-1;
            r = (palindrome.length()/2);
        }  else {//odd length
            l = (palindrome.length()/2) - 1;
            r = (palindrome.length()/2) + 1;
        }


        while(l>=0 && r<palindrome.length()){
            if(palindrome.charAt(l)!=palindrome.charAt(r)){   
                return false;
            }
            l--;
            r++;
        }
        return true;
    }
}
