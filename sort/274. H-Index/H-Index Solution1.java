public class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        int i;
        int len = citations.length;
        for(i=len-1;i>=0;i--){
        	int h = len-i;
        	if((citations[i]>=h)&&h>hIndex)
        		hIndex = h;
        	else break;
        }
		return hIndex;
        
    }
}