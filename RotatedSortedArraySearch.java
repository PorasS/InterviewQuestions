class Solution {
    int pivotG = 0;
    public int search(int[] nums, int target) {
        
        int l=0;
        int h=nums.length-1;
        int pivot = 0;
        
        // first we get the pivot point
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                pivot = i;
                break;
            }
        }
    
        //we run a binary search from 0 to pivot, and then pivot+1 to nums.length-1
        //and search for the target
        int s1 = binarySearch(0, pivot-1,target,nums);
        int s2 = binarySearch(pivot, nums.length-1, target,nums);
        
        if(s1==-1 && s2==-1){
            return -1;
        }
        
        if(s1==-1 && s2!=-1){
            return s2;
        }else{
            return s1;    
        }
        
    }
        
    public int binarySearch(int l, int h, int target, int[] nums){
        int mid = 0;
        
        while(l<=h){
            
            mid = (l+h)/2;
            
            if(nums[mid] == target){
                return mid;
            }
            
            if(nums[mid]>target){
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        
        return -1;
    }
}
