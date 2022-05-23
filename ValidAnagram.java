public class Solution {
    /**
     * @param s: The first string
     * @param t: The second string
     * @return: true or false
     */
    public boolean anagram(String s, String t) {
                   if(s==null || t == null){
		        return false;
            }

            if(s.length()!=t.length()){
                return false;
            }

            //create map for s,t
            Map<Character, Integer> smap= new HashMap<>();
            Map<Character, Integer> tmap= new HashMap<>();

            for(int i = 0; i<s.length(); i++){ //O(n)
                if(!smap.containsKey(s.charAt(i))){
                        smap.put(s.charAt(i),1);
                }else{
                    smap.put(s.charAt(i), smap.get(s.charAt(i))+1);
                }
            }

            for(int i = 0; i<t.length(); i++){ //O(n)
                if(!tmap.containsKey(t.charAt(i))){
                        tmap.put(t.charAt(i),1);
                }else{
                    tmap.put(t.charAt(i), tmap.get(t.charAt(i))+1);
                }
            }
          
          for(Map.Entry<Character, Integer> entry : smap.entrySet()){ //O(n)
                if(!tmap.containsKey(entry.getKey()) || entry.getValue() != tmap.get(entry.getKey())){
                    return false;
                }
            }

            return true;
    }
}
