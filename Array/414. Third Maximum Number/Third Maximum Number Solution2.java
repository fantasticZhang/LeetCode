public class Solution {
    public int thirdMax(int[] nums) {
       long max  = Long.MIN_VALUE,second = Long.MIN_VALUE, third = Long.MIN_VALUE;
       for(int num : nums){
    	   if(num == max || num == second) continue;
    	   if(num>max){
    		   third = second;
    		   second = max;
    		   max = num;
    	   }else if(num >second){
    		   third = second;
    		   second = num;
    	   }else if(num>third){
    		   third = num;
    	   }
       }
       if(third == Long.MIN_VALUE) return (int)max;
        
       return (int)third;
    }
}