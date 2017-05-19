public class Solution {
	public boolean containsDuplicate(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int num : nums){
			if(num<min)
				min = num;
			if(num>max)
				max = num;
		}
		boolean flags[] = new boolean[max-min+1];
		for(int num : nums){
			if(flags[num-min]) return true;
			else flags[num-min] = true;
		}
		return false;
	}
}