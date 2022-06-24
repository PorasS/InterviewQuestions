class Solution {
    public int maxArea(int[] height) {
    
    //area = h*w
 	int max = -1;

	int l = 0;
	int r = height.length-1;
	
    while(l<r){
        max  = Math.max(max, Math.abs(l-r)*Math.min(height[l], height[r]));
        if(l==r){
            l++;
            r--;
        }else if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
    }
        
    return max;    
    }
}
