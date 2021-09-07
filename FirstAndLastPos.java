class Solution {
    int res[] = {-1,-1};
    
    public int[] searchRange(int[] nums, int target) {
    if(nums.length==1){
        if(nums[0]==target){
            return new int[]{0,0};
        }else{
            return res;
        }
    }
        
        firstPosition(nums,target);
        lastPosition(nums,target);
        
       return res;
    }
    
    public void firstPosition(int[] nums, int target){
        int l=0;
        int h=nums.length-1;
        
        while(l<=h){
            int mid = (l+h)/2;
            
            if(nums[mid] == target){
                if(mid-1>=0 && nums[mid] == target && nums[mid-1]!=target){
                    res[0]=mid;
                    break;
                }else{
                    if(mid-1<0){
                        res[0]=mid;
                        break;
                    }
                    
                    h=mid-1;
                }
            }else{
                 if(nums[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
                }
            }
            
        }
    }
    
    public void lastPosition(int[] nums, int target){
        int l=0;
        int h=nums.length-1;
        
        while(l<=h){
            int mid = (l+h)/2;
            
            if(nums[mid] == target){
                if(mid+1<nums.length && nums[mid] == target && nums[mid+1]!=target){
                    res[1]=mid;
                    break;
                }else{
                    if(mid+1>nums.length-1){
                        res[1]=mid;
                        break;
                    }
                    
                    l=mid+1;
                }
            }else{
                 if(nums[mid]>target){
                h=mid-1;
            }else{
                l=mid+1;
                }
            }
            
        }
    }
}
