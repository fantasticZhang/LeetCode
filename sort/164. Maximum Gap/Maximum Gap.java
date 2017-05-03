public class Solution {
    public int maximumGap(int[] nums) {
       	   if((nums == null) || nums.length<2) return 0;
	       int len = nums.length;   
	       int[] bucketsMax = new int[len-1];  //��¼ÿ��Ͱ�����ֵ
	       int[] bucketsMin = new int[len-1];   //��¼ÿ��Ͱ����Сֵ
	       Arrays.fill(bucketsMax,Integer.MIN_VALUE);
	       Arrays.fill(bucketsMin, Integer.MAX_VALUE);
	       int i,max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
	       //����nums��������е����ֵmax����Сֵmin
	       for(i = 0;i<len;i++){ 
	    	   if(nums[i]>max) max = nums[i];
	    	   if(nums[i]<min) min = nums[i];
	       }
	       int gap = (int)Math.ceil((double)(max-min)/(len-1));
	       //��ÿ��Ͱ�����ֵ����Сֵ
	       for(int num:nums){
	    	   if(num == min || num == max) continue;  //min��max������Ͱ��
	    	   int idx = (num-min)/gap;
	    	   bucketsMax[idx] = Math.max(num, bucketsMax[idx]);
	    	   bucketsMin[idx] = Math.min(num, bucketsMin[idx]);
	       }
	       int maxGap = 0,pre = min;
	       for(i=0;i<len-1;i++){
	    	   if (bucketsMin[i] == Integer.MAX_VALUE && bucketsMax[i] == Integer.MIN_VALUE)
	               // ��Ͱ
	               continue;
	    	   maxGap = Math.max(maxGap, bucketsMin[i]-pre);
	    	   pre = bucketsMax[i];
	       }
	       maxGap = Math.max(maxGap, max-pre);
			return maxGap;
    }
}