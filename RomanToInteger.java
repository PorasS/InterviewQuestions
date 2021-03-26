class Solution {
    
     Map<String, Integer> map = new HashMap<>();
       
    
    public int romanToInt(String s) {
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        
        int ans = 0;
        int prevNo = 4000;
        
        for(int i=0; i<s.length();i++){
        int num = map.get(Character.toString(s.charAt(i)));
            
        if(num>prevNo){
            int num2 = num - prevNo;
            ans = ans - prevNo;
            ans = ans + num2;
        }else{
            ans = ans + num;
            prevNo = num;
        }     
        }
        
        return ans;
    }
}
