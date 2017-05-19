public class Solution {
    public int arrayPairSum(int[] nums) {
        int result = 0;
		Arrays.sort(nums);
		int len = nums.length;
		for(int i=0;i<len;i+=2){
			result+=nums[i];
		}
		return result;
    }
}