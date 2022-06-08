class Solution {
    public void rotate(int[][] matrix) {
    //create a transpose of matrix, swapping elements diagonally
	for(int i = 0; i<matrix[0].length; i++){
		for(int j=i; j<matrix.length;j++){
			int temp = matrix[i][j];
			matrix[i][j] = matrix[j][i];
			matrix[j][i] = temp;
        }
    }

    //reverse each row
    for(int i =0; i<matrix[0].length; i++){
    int l =0;
    int r = matrix[0].length-1;
        while(l<r){
            int temp=matrix[i][r];
            matrix[i][r]=matrix[i][l];
            matrix[i][l] = temp;
            l++; r--;
        }
    }
   
    }
}
