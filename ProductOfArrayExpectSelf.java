class Solution {
    public int[] productExceptSelf(int[] nums) {
        
    int res[] = new int[nums.length];

	//[1,2,3,4]
	int lp[] = new int[nums.length];//left product
    int rp[] = new int[nums.length];//right product
    lp[0]=nums[0]; //[1,2,3,4]
    for(int i = 1; i<nums.length;i++){ //o(n)
        lp[i]=nums[i]*lp[i-1];
    }
    rp[nums.length-1] = nums[nums.length-1];
    for(int j=nums.length-2; j>=0;j--){ //o(n)
        rp[j] = nums[j]*rp[j+1];
    }

    res[0] = rp[1];
    for(int i=1;i<nums.length;i++){ //o(n)
            int r = (i+1==nums.length)?1:rp[i+1];
            res[i] = lp[i-1] * r;
    }

        return res;
    }
}
