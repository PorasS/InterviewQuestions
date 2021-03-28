class Solution {
    
    Map<Character, Integer> map = new HashMap<>();
       
    public int romanToInt(String s) {
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int ans = 0;
        int prevNo = 4000;
        
        for(int i=0; i<s.length();i++){
        int num = map.get(s.charAt(i));
            
        if(num>prevNo){
            ans = (ans - prevNo) + (num - prevNo);
        }else{
            ans = ans + num;
            prevNo = num;
        }     
        }
        return ans;
    }
}
