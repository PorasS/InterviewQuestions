class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        //check row
        for(int i= 0; i < board.length; i++){
            char[] array = board[i];
            Set<Character> charRow = new HashSet<>();
            for(int j = 0; j < array.length; j++){
               char ch = array[j];
                if(ch != '.'){
                    if(charRow.contains(ch)){
                        return false;
                    }else{
                        charRow.add(ch);
                    }
                }   
            }
            
        }
        
        //check column
        for(int i = 0; i < board.length; i++){
            Set<Character> charCol = new HashSet<>();
            for(int j = 0; j< board[0].length; j++){
                char ch = board[j][i];
                if(ch != '.'){
                    if(charCol.contains(ch)){
                    return false;
                }else{
                    charCol.add(ch);
                }   
                }
            }
        }
        
        //check grid
        for(int i = 0; i < board.length; i=i+3){
            for(int j = 0; j < board[0].length; j=j+3){
                if(!gridSearch(board, i,j)){
                    return false;
                }
            }
        }
        return true;
        
    }
    
    
    private boolean gridSearch(char[][] board, int k, int l){
        Set<Character> charSet = new HashSet<>();
        for(int i=k;i<(k+3);i++){
            for(int j=l;j<(l+3);j++){
                char ch = board[i][j];
                if(ch!='.'){
                    if(charSet.contains(ch)){
                        return false;
                    }else{
                        charSet.add(ch);
                    }
                }
            }
        }
        return true;
    }
    
}
