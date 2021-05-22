class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> intList = new HashSet<>();
        //O(nlogn) for sort
        Arrays.sort(nums);
        
        int arrLen = nums.length;
        
        for(int i = 0;i<arrLen;i++){
            int x = -nums[i];
        
            int k = i+1;
            int l = arrLen - 1;
            
            while(k<l){
                if(nums[k] + nums[l] == x){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[k]);
                    list.add(nums[l]);
                    intList.add(list);
                }
                
                if(x<(nums[k]+nums[l])){
                    l--;
                }else{
                    k++;
                }
            }
        }
    return new ArrayList<>(intList);
    }
}
