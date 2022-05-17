/**
 * Definition of Interval:
 * public class Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
 
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (Interval s1,Interval s2)-> s1.start - s2.start);
        
        for(int i = 0; i<intervals.size()-1; i++){
            Interval first = intervals.get(i);
            Interval sec = intervals.get(i+1);
                if(sec.start<first.end){
                    return false;
                }
            }
            return true;
    }
}
