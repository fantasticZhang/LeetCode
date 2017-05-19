public class Solution {
    public int thirdMax(int[] nums) {
       int maxNum = nums[0];
        int i,len;
        for(i=1,len=nums.length;i<len;i++){
        	maxNum = Math.max(maxNum, nums[i]);
        }
        if(len<3) return maxNum;
        
        int second = maxNum;
        for(i=0,len=nums.length;i<len;i++){
        	if(nums[i]<maxNum){
        		if(second == maxNum){
        			second = nums[i];
        		}else{
        			second = Math.max(second, nums[i]);
        		}
        	}
        }
        if(second == maxNum)  return maxNum;
        
        int third = second;
        for(i=0,len=nums.length;i<len;i++){
        	if(nums[i]<second){
        		if(second == third){
        			third = nums[i];
        		}else{
        			third = Math.max(third, nums[i]);
        		}
        	}
        }
        if(second == third)  return maxNum;
        
        return third;
    }
}