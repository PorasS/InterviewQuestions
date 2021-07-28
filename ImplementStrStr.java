class Solution {
    public int strStr(String haystack, String needle) {
        
       if(needle.isEmpty()){
			return 0;
		}
        
        if(needle.length()>haystack.length()){
            return -1;
        }
        
        int j=0;
        int i;

		for(i=0; i<haystack.length();i++){
			if(j == needle.length()){
				return i-1;
			}

			if(haystack.charAt(i) == needle.charAt(j)){
				j++;
				for(int k = i+1; k<haystack.length();k++){
					if(j == needle.length()){
						break;
					}

					if(haystack.charAt(k) == needle.charAt(j) && j<needle.length()){
						j++;
					}else{
						j=0;
						break;
					}
				}
			}
		}
        
        if(j == needle.length()){
			return i-1;
		}

		return -1;
        
    }
}
