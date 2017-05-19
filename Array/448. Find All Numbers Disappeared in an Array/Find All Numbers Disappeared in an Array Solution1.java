public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();  
        int i=0,len=nums.length;
        while(i<len){
        	int index = Math.abs(nums[i++])-1;
        	nums[index] =  nums[index]>0?-nums[index]:nums[index];
        }
        for(i=0;i<len;i++){
        	if(nums[i]>0){
        		result.add(i+1);
        	}
        } 
        return result;
    }
}