class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        int  count = 0;
        for(int i=0; i<intervals.length-1; i++){
            
            if(!(intervals[i][1]<=intervals[i+1][0])){
                //update the next intervals with min end time
                intervals[i+1][1] = Math.min(intervals[i][1], intervals[i+1][1]);
                count ++;
            }
            
        }
        
        return count;
    }
}
