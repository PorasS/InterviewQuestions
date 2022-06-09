class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();        
        for(int i = 0;i<nums.length;i++){  //O(n)
            if(s.contains(nums[i])){ //already visited
                return true;
            }else{
                s.add(nums[i]);
            }
        }
    
        return false;
    }
}
