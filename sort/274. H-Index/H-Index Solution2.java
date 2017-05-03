public class Solution {
    public int hIndex(int[] citations) {
       int len = citations.length;  
	        int[] countArray = new int[len+1];  
	          
	        for(int i=0; i<len; i++) {  
	            if(citations[i] >= len) countArray[len]++;  
	            else countArray[citations[i]]++;  
	        }  
	          
	        if(countArray[len]>=len) return len;  
	          
	        for(int i=len-1; i>=0; i--) {  
	            countArray[i] = countArray[i] + countArray[i+1];  
	            if(countArray[i]>=i) return i;  
	        }  
	        return 0;  
    }
}