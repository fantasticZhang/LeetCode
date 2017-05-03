public class Solution {
    public String largestNumber(int[] nums) {
		
		if(nums.length == 0 || nums == null) return "";
		String[] divide = new String[nums.length];
		int i;
		for(i=0;i<nums.length;i++){
			divide[i] = ""+nums[i];
		}
		Arrays.sort(divide,new Solution.Order());
		
		if(divide[0].equals("0")) return "0";
		
        String max = "";
        for(i=0;i<divide.length;i++){
        		max += divide[i];
        	
		}
		return max;
    }
	
	 public static class Order implements Comparator<String>{

			@Override
			public int compare(String s1, String s2) {
				String tmp1 = s1+s2;
				String tmp2 = s2+s1;
				return tmp2.compareTo(tmp1);
				
			}
	    	
	}
}