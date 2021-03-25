class Solution {
    String ans = "";
    
    String rem = "";
    
    Map<Integer, String> map = new HashMap<>();
    
    public String intToRoman(int num) {
        
        map.put(1,"I");
        map.put(5,"V");
        map.put(10,"X");
        map.put(50,"L");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");
        map.put(90,"XC");
        map.put(400,"CD");
        map.put(900,"CM");
        
        
        String str = String.valueOf(num);
        int length = str.length()-1;
    
       for(int i=0;i<str.length();i++){
           convert(Character.getNumericValue(str.charAt(i))*(int)Math.pow(10,length-i));
       }
        
        
        return ans;
    }

   void convert(int num){
       
       if(num!=0 && map.containsKey(num)){
          ans = ans + map.get(num); 
       }else{
          remainder(num);
       }
       
   }
    
    //600
    String remainder(int num){
        
        
         if(num>=1 && num<5){
            ans = ans + map.get(1);
            remainder(num-1);
        }
        
        
        if(num>=5 && num<10){
            ans = ans + map.get(5);
            remainder(num-5);
        }
        
        if(num>=10 && num<50){
            ans = ans + map.get(10);
            remainder(num-10);
        }
        
        if(num>=50 && num<100 ){
             ans = ans + map.get(50);
             remainder(num-50);
        }
        
        if(num>=100 && num<500){
             ans = ans + map.get(100);
             remainder(num-100);  
        }
        
        if(num>=500 && num< 1000 && num>0){
             ans = ans + map.get(500);
             remainder(num-500);
        }
        
        if(num>=1000){
             ans = ans + map.get(1000);
             remainder(num-1000);
        }
        
        
        
        return "";
    }
    
}
