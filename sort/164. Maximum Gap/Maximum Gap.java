public class Solution {
    public int maximumGap(int[] nums) {
       	   if((nums == null) || nums.length<2) return 0;
	       int len = nums.length;   
	       int[] bucketsMax = new int[len-1];  //记录每个桶的最大值
	       int[] bucketsMin = new int[len-1];   //记录每个桶的最小值
	       Arrays.fill(bucketsMax,Integer.MIN_VALUE);
	       Arrays.fill(bucketsMin, Integer.MAX_VALUE);
	       int i,max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
	       //遍历nums，求得其中的最大值max和最小值min
	       for(i = 0;i<len;i++){ 
	    	   if(nums[i]>max) max = nums[i];
	    	   if(nums[i]<min) min = nums[i];
	       }
	       int gap = (int)Math.ceil((double)(max-min)/(len-1));
	       //求每个桶的最大值和最小值
	       for(int num:nums){
	    	   if(num == min || num == max) continue;  //min和max不放入桶中
	    	   int idx = (num-min)/gap;
	    	   bucketsMax[idx] = Math.max(num, bucketsMax[idx]);
	    	   bucketsMin[idx] = Math.min(num, bucketsMin[idx]);
	       }
	       int maxGap = 0,pre = min;
	       for(i=0;i<len-1;i++){
	    	   if (bucketsMin[i] == Integer.MAX_VALUE && bucketsMax[i] == Integer.MIN_VALUE)
	               // 空桶
	               continue;
	    	   maxGap = Math.max(maxGap, bucketsMin[i]-pre);
	    	   pre = bucketsMax[i];
	       }
	       maxGap = Math.max(maxGap, max-pre);
			return maxGap;
    }
}