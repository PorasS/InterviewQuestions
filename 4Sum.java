class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        Set<List<Integer>> outerList = new HashSet<>();
        List<List<Integer>> list  = null;
        
        for(int i=0; i < nums.length; i++){
            int sum = target - nums[i];
                     
            list = threeSum( nums, i+1, sum);
            
            boolean ans = list.isEmpty();
            
            if(ans == false){
                for( List l:list){
                    l.add(nums[i]);
                    outerList.add(l);
                }
            }
            
        }
        
        return new ArrayList<>(outerList);
        
    }
    
    public  List<List<Integer>>  threeSum(int[] nums, int idx, int target){
        
       
        List<List<Integer>> outerList = new ArrayList<>();
        
        for(int i = idx; i< nums.length; i++){
            int sum = target - nums[i];
            int l = i+1;
            int r = nums.length-1;
            
            while(l<r){
                if(sum == (nums[l]+nums[r])){
                    List<Integer> intList = new ArrayList<>();
                    intList.add(nums[i]);
                    intList.add(nums[l]);
                    intList.add(nums[r]);
                    
                    outerList.add(intList);
                }
                
                if(sum > (nums[l]+nums[r])){
                    l++;
                }else{
                    r--;
                }
            }
        }
        
        return outerList;
    }
}
