class Solution {
    public int[][] merge(int[][] intervals) {
            
        int index = 0;
        int count = 0;
        
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0],b[0])); //increasing order
            
        //O(n)
        for(int i=0; i<intervals.length-1; i++){ 
    
            if(intervals[i][1]>=intervals[i+1][0]){
                //overlapping
                intervals[i+1][0] = Math.min(intervals[i][0],intervals[i+1][0]);
                intervals[i+1][1] = Math.max(intervals[i][1],intervals[i+1][1]);
                intervals[i][0] = -1;
                intervals[i][1] = -1;      
                count++;
            }

        }
        
        int[][] res = new int[intervals.length - count][2];
        
        //O(n)
        for(int i=0; i<intervals.length; i++){
            if(intervals[i][0] == -1 && intervals[i][1]==-1){
                continue;
            }
            
            if(index<res.length){
                res[index][0] = intervals[i][0];
                res[index][1] = intervals[i][1];
                index++;
            }
        }
        
       return res;
    }
}
