public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums==null || nums.length==0) return nums;
		 if(r*c!=nums.length*nums[0].length) return nums;

		 int[][] result = new int[r][c];
		 int i=0,n = nums[0].length,count=r*c;
		 while(i<count){
			 result[i/c][i%c] = nums[i/n][i%n];
			 i++;
		 }

		 return result;

    }
}
