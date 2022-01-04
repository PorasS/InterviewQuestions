class Solution {
    
    Map<Integer, Integer> robMoneyMap1 = new HashMap<>();
     Map<Integer, Integer> robMoneyMap2 = new HashMap<>();
    public int rob(int[] nums) {
        
        if(nums.length<=1){
            return nums[0];
        }
        
        int money1 = robMoneyFirst(0, nums, nums.length - 1);
        robMoneyMap1 = new HashMap<>();
        
        int money2 = 0;
        
        for(int i = 1; i < nums.length; i++){
          int mon2 = robMoneyFirst(i, nums, nums.length);
            
            if(mon2>money2){
                money2 = mon2;
            }
            
        }
        
        int money3 = nums[nums.length - 1]; //last element money
                  
        return Math.max(Math.max(money1,money2),money3);
        
    }
    
    public int robMoneyFirst(int idx, int [] nums, int end){
             
        if(robMoneyMap1.containsKey(idx)){
            return robMoneyMap1.get(idx);
        }
        
        if(idx == end){
            return nums[idx];
        }
        
        int totalRobbed = nums[idx];
        
        for(int i = idx+2; i<end; i++){
            int robMoney = 0;
            robMoney = nums[idx] + robMoneyFirst(i, nums, end);
            
            if(totalRobbed < robMoney){
                totalRobbed = robMoney;
            }
        }
        
        robMoneyMap1.put(idx, totalRobbed);
        
        return totalRobbed;
        
    }
    
}
