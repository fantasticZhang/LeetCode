public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums==null || nums.length==0) return nums;
		 if(r*c!=nums.length*nums[0].length) return nums;
		 int[][] result = new int[r][c];
		 int[] tmp = new int[r*c];
		 int index=0,j,i,len;
		 for(i=0,len=nums.length;i<len;i++){
			 for(j=0;j<nums[i].length;j++){
				 tmp[index++] = nums[i][j];
			 }
		 }
		 index=0;
		 for(i=0;i<r;i++){
			 for(j=0;j<c;j++){
				 result[i][j]=tmp[index++];
			 }
		 }
		 return result;
	        
    }
}