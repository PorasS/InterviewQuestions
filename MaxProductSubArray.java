class Solution {
    public int maxProduct(int[] nums) {
        
       //base condition
        int length = nums.length;
        if(length==1){
            return nums[0];
        }
        
        int min = nums[0];
        int max = nums[0];
        int res = nums[0];
        
        for(int i = 1; i<length; i++){  
            int tempMax = Math.max(nums[i]*max, Math.max(nums[i]*min,nums[i]));
            min = Math.min(nums[i]*max, Math.min(nums[i]*min,nums[i]));
            max = tempMax;
            res = Math.max(res,max);
        }
        
        
        return res;
       
    }
}
