class Solution {
    public boolean canJump(int[] nums) {
        
        
        int reachable = 0;
        
        for(int i=0; i<nums.length; i++){
            
            if(reachable >= nums.length-1){
                return true;
            }
            
            //if index smaller than reachable
            if(i<=reachable){
                if((i+nums[i])>reachable){
                    reachable = i+nums[i];
                }
            }else{
                return false;
            }
        }
        
        return false;
        
    }
}
