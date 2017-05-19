public class Solution {
	public int missingNumber(int[] nums) {
		if(nums==null || nums.length == 0) return 0;
		int result = 0,i,len;
		for(i=0,len=nums.length;i<len;i++){
			result += i-nums[i];
		}
		return result+i;
	 }
}