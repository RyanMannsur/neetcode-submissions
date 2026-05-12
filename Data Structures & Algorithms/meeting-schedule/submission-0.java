/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        for (int i=0; i<intervals.size(); i++) {
            Interval meeting1 = intervals.get(i);
            for(int j=i+1; j<intervals.size(); j++) {
                Interval meeting2 = intervals.get(j);

                if (meeting1.start < meeting2.end && meeting1.end > meeting2.start) {
                    return false;
                }
            }
        }

        return true;
    }
}
