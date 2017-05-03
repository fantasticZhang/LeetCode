public class Solution {
   public void wiggleSort(int[] nums) {
        
		if(nums.length>1){
			int len = nums.length;
			int[] tmp = Arrays.copyOfRange(nums, 0,len );
			Arrays.sort(tmp);
			int small = len/2 + (len%2 == 0 ? -1 : 0);
			int large = len-1;
			int i,j;
			for(i=0,j=1;i<len;i+=2,j+=2 ){
				nums[i] = tmp[small--];
				if(j<len) nums[j] = tmp[large--];
			}
		}
    }
}