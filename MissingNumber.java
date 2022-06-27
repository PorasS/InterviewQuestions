class Solution {
    public int missingNumber(int[] nums) {
        
        int total = 0;
        int newTotal = 0;
        
        for(int i = 0; i<nums.length; i++){
            total+=nums[i];
        }
           
        for(int j = 0; j<nums.length+1; j++){
            newTotal +=j;
        }
        
        return newTotal-total;
    }
}
