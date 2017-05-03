public class Solution {
    public void sortColors(int[] nums) {
        int red = 0,blue = nums.length-1;
		 int i,tmp;
		 for(i=0;i<=blue;i++){
			 while(nums[i]==2 && i<blue){
				 tmp = nums[i];
				 nums[i] = nums[blue];
				 nums[blue--] = tmp;
			 }
			 while(nums[i]==0 && i>red){
				 tmp = nums[i];
				 nums[i] = nums[red];
				 nums[red++] = tmp;
			 }
		 }
    }
	
}