class Solution {
    int lc = 1;
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        Arrays.sort(nums); //o(nlogn)
        int count = 1;
        
        int length = nums.length;
        
        for(int i = 0; i<length; i++){ //o(n)
            //skip duplicates
            if((i+1 < length) && nums[i] == nums[i+1]){
                continue;
            }
            if((i+1 < length) && nums[i]+1 == nums[i+1]){
                count ++;  
                if(count > lc){
                    lc = count;
                }
            }else{
                count = 1;
            }
            
        }
        return lc;
    }
}
