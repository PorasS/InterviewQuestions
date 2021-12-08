class Solution {
    
    Map<Integer, Integer> resMap = null;
    public int rob(int[] nums) {
        
        resMap = new HashMap<>();
        
        int money1 = 0;
        int money2 = 0;
        
        if(nums.length == 1){
            return nums[0];
        }
        
        if(nums.length == 2){
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }
        
        money1 = robMoney(0,nums);
        money2 = robMoney(1,nums);
        
        return money1 > money2 ? money1 : money2;
        
    }
    
    public int robMoney(int idx, int[] nums){
        
        if(resMap.containsKey(idx)){
            return resMap.get(idx);
        }
        
        int total = 0;
        int res = nums[idx];
        
        for(int i = idx+2; i<nums.length; i++){
            if(nums[idx]!=0){
                total = nums[idx] + robMoney(i, nums);
                if(res < total){
                    res = total;
                    resMap.put(idx, res);
                }
            }
        }
        
        return res;
    }
}
