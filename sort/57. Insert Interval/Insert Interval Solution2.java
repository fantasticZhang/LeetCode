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
        List<Interval> result = new LinkedList<Interval>();
        if(intervals == null) {
			result.add(newInterval);
			return result;
		}
		int i=0,size=intervals.size();
		//��������newInterval֮ǰ��Ԫ�ض��ŵ������
		while((i<size) && intervals.get(i).end<newInterval.start){
			result.add(intervals.get(i++));
		}
		//��������newInterval�غϵ�Ԫ�غϲ���newInterval
		while((i<size) && intervals.get(i).start<=newInterval.end){
			newInterval.start = newInterval.start<intervals.get(i).start?newInterval.start:intervals.get(i).start;
			newInterval.end = newInterval.end>intervals.get(i).end?newInterval.end:intervals.get(i).end;
			i++;
		}
		result.add(newInterval);
		while(i<size){
			result.add(intervals.get(i++));
		}
		return result;
    }
}