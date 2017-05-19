public class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
        int pairs = 0;
		Arrays.sort(nums);
		int i,j,len;
		for(i=0,len=nums.length;i<len;i++){
			if(i>0 && (nums[i]==nums[i-1])) continue;   //≤ª÷ÿ∏¥º∆À„
			for(j=i+1;j<len;j++){
				if((nums[j]-nums[i])<k) continue;
				if((nums[j]-nums[i])== k){
					pairs++;
					break;
				}
				if((nums[j]-nums[i])>k) break;
			}
		}
		
	    return pairs;    
    }
}