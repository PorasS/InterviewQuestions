 class Solution {
    public int[] countBits(int n) {
        
        int[]res = new int[n+1];

        for(int i = 1;i<res.length;i++){
            int val = i;
            int count = 0;
            while(val!=0){
                if(val%2 == 1){
                    count++;
                }
                val = val>>1;
            }
            res[i]=count;
        }

        return res;        
    }
}
