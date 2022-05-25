public class Solution {
    /*
     * @param strs: a list of strings
     * @return: encodes a list of strings to a single string.
     */
    char delimiter = '#';
    public String encode(List<String> strs) {
        String encode = "";
        for(String str : strs){//O(n)
            encode+=Integer.toString(str.length())+delimiter+str;
        }
        return encode;
    }

    /*
     * @param str: A string
     * @return: dcodes a single string to a list of strings
     */
    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        if(str==null || str.length()==0){
            return list;
        }
        //1#I2#am
        int i=0;
        int j =0 ;
        while(i<str.length()){//O(n)
            if(str.charAt(i)==delimiter){
                //get the int
                //get the substring
                int len = Integer.parseInt(str.substring(j,i));
                i++;
                list.add(str.substring(i,i+len));
                i+=len;
                j=i;
            }else{
                i++;
            }

        }
        return list;
    }
}
