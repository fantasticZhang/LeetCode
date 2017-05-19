import java.util.HashMap;
import java.util.Map;

public class Solution {
	public boolean containsDuplicate(int[] nums) {
		Map<Integer,Integer> map = new HashMap<>();
	      for(int num : nums){
	    	  map.put(num, map.getOrDefault(num, 0)+1);
	      }
	      for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	    	  if(entry.getValue()>=2) return true;
	      }
	      return false;
	}
}