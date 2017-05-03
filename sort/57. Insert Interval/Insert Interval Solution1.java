/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if(intervals == null) {
			List<Interval> result = new LinkedList<Interval>();
			result.add(newInterval);
			return result;
		}
		int i,end,size=intervals.size();
		Interval current;
		for(i=0;i<size;i++){
			current = intervals.get(i);
			if((newInterval.start>=current.start) && (newInterval.start<=current.end)){
				if(newInterval.end<=current.end) break;
				else{
					end = newInterval.end;
					for(int j=i+1;j<size;){
						Interval tmp = intervals.get(j);
						if((end>=tmp.start)){
							end = Math.max(end, tmp.end);
							intervals.remove(j);
							size=intervals.size();
						}else break;
					}
					current.end = end;
					intervals.set(i, current);
					break;
				}
			}else if((newInterval.end>=current.start) && (newInterval.end<=current.end)){
				current.start = newInterval.start<current.start ? newInterval.start:current.start;
				intervals.set(i, current);
				break;
			}else if((newInterval.start<=current.start) && (newInterval.end>=current.end)){
				current.start = newInterval.start;
				end = newInterval.end;
				for(int j=i+1;j<size;){
					Interval tmp = intervals.get(j);
					if((end>=tmp.start)){
						end = Math.max(end, tmp.end);
						intervals.remove(j);
						size=intervals.size();
					}else break;
				}
				current.end = end;
				intervals.set(i, current);
				break;
			}else if((newInterval.start<current.start) && (newInterval.end<current.start)){
				intervals.add(newInterval);
				intervals.sort((i1,i2) -> Integer.compare(i1.start, i2.start));
				break;
			}
		}
		if(i==size){
			intervals.add(i, newInterval);
			intervals.sort((i1,i2) -> Integer.compare(i1.start, i2.start));
		}
		return intervals;
    }
}