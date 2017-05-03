
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
    public List<Interval> merge(List<Interval> intervals) {
         int i,j;
	   Interval current,next;
	   intervals.sort(new intervalComparator());
	   for(i = 0; i<intervals.size();i++){
		   current = intervals.get(i);
		   for(j=i+1;j<intervals.size();){
			   next = intervals.get(j);
			   if(current.end>=next.start ){
				   if(current.end<=next.end){
					   current.end = next.end;
					   intervals.set(i, current);
					   intervals.remove(j);
				   }else{
					   intervals.remove(j);
				   }
			   }else{
				   break;
			   }
		   }
	   }
	   
        return intervals;
    }
    
    private class intervalComparator implements Comparator<Interval>{

	@Override
	public int compare(Interval i0, Interval i1) {
		// TODO Auto-generated method stub
		return i0.start-i1.start;
	}
	   
   }
}