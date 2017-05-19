public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if(nums == null ||nums.length==0) return 0;
        int maxNum = 0,tmpNum = 0;
        int i=0,len = nums.length;
        for(;i<len;i++){
        	if(nums[i]==1){
        		tmpNum++;
        	}else{
        		if(tmpNum>maxNum){
        			maxNum=tmpNum;
        		}
        		tmpNum=0;
        	}
        }
        if(tmpNum>maxNum){
            maxNum=tmpNum;
            
        }
        return maxNum;
    }
}