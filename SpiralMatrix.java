class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        int t = 0;
		int r = matrix[0].length-1;
		int l = 0;
		int b = matrix.length-1;
        
        System.out.println(b+" "+r);
	
        List<Integer> list = new ArrayList<>();

		while(t<=b && l<=r){
			for(int i = l; i<=r; i++){
				list.add(matrix[t][i]);
            }
            t+=1;
            for(int j = t;j<=b; j++){
                list.add(matrix[j][r]);
            }
            r-=1;
            if(t<=b && l<=r){
                for(int k = r; k>=l;k--){
                list.add(matrix[b][k]);
                }
                b-=1;
                for(int m = b; m>=t; m--){
                    list.add(matrix[m][l]);
                }
                l+=1;   
            }
        }
        return list;
    }
}
