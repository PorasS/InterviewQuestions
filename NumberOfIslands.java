class Solution {
    
    int rows = 0;
    int cols = 0;
    int island = 0;
    Set<String> set = null;
    char[][] gridGlobal = null;
    Queue<String> q = new LinkedList<>(); 
    public int numIslands(char[][] grid) {
        
        
        gridGlobal = grid;
        
        rows = grid.length;
        cols = grid[0].length;
          
        set = new HashSet<>();
        
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){   
                if(!set.contains(Integer.toString(i)+":"+Integer.toString(j)) && (grid[i][j] == '1')){
                    bfs(i,j);
                    island++;
                }
            }
        }
        return island;
    }
    
    
    public void bfs(int row, int col){
        
        if(set.contains(Integer.toString(row)+":"+Integer.toString(col)) || row >= rows || col >= cols || row < 0 || col < 0){
            return;
        }
        
        if(gridGlobal[row][col] == '0'){
            return;
        }
        
        //visit it
        set.add(Integer.toString(row)+":"+Integer.toString(col));
        
        //enque all adjacent cells
        q.add(Integer.toString(row+1)+":"+Integer.toString(col));
        q.add(Integer.toString(row-1)+":"+Integer.toString(col));
        q.add(Integer.toString(row)+":"+Integer.toString(col+1));
        q.add(Integer.toString(row)+":"+Integer.toString(col-1));
           
        while(!q.isEmpty()){
            String rc[] = q.remove().split(":");
            int r = Integer.valueOf(rc[0]);
            int c = Integer.valueOf(rc[1]);
            bfs(r,c);
        }
    }
}
