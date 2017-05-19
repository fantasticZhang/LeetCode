public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0,i,len;
        for(i=0,len=nums.length;i<len;i++){
        	if(nums[i] == 0) count++;
        	else if(count>0){
        		nums[i-count] = nums[i];
        		nums[i] = 0;
        	}
        }
        
    }
}