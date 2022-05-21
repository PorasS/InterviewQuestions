class Solution {
    public int characterReplacement(String s, int k) {
        
        if(s==null && s.length()==0){
	        return 0;
        }
        
        
        int res = 0;
        int i = 0;
        int j = 0;
        int occur = 0;

        Map<Character, Integer> map = new HashMap<>();
        
        while(i<s.length()){//upto length of the string O(n)
     
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }	

            //check for max occurance of a character
            for(Map.Entry<Character, Integer> entry: map.entrySet()){//mapSize O(m) m = 26, 
                occur = Math.max(occur,entry.getValue()); 
            }

            if((i-j+1) - occur <= k){//windowSize = i-j+1
                res = Math.max(res, (i-j+1));
                i++;
            }else{
                map.put(s.charAt(j), map.get(s.charAt(j))-1);
                j++;i++;
            }
        }
        
        //total complexity O(n*26) = O(n)

        return res;

    }

}
