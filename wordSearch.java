class Solution {

    public boolean exist(char[][] board, String word) {
        
        for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board[0].length; j++){
               if(board[i][j] == word.charAt(0) && dfs(board,i,j,0,word)){        
                    return true;
               }
            }
        }
        return false;
    }
    
    
    public boolean dfs(char[][] gboard, int r,int c,int idx,String word){
            if(idx == word.length()){
                return true;
            }
            
            if(r<0 || c<0 || c>= gboard[0].length || r>=gboard.length || gboard[r][c]!=word.charAt(idx)){
                return false;
            }
        
            char temp = gboard[r][c];
            gboard[r][c]=' ';
            
            boolean res = (dfs(gboard, r,c+1,idx+1,word) || dfs(gboard, r,c-1,idx+1,word) || dfs(gboard, r+1,c,idx+1,word) || dfs(gboard, r-1,c,idx+1,word));
            
            gboard[r][c] = temp;
                   
            return res;
    }
}
