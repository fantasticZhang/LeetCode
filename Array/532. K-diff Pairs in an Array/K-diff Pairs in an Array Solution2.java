public class Solution {
    public int findPairs(int[] nums, int k) {
        if(k<0) return 0;
		int pairs = 0;
		Map<Integer,Integer> map = new HashMap<>();
		for(int num : nums){
			map.put(num, map.getOrDefault(num, 0)+1);
		};
		for(Map.Entry<Integer,Integer> entry: map.entrySet() ){
			if(k==0){
				if(entry.getValue()>=2) pairs++;
			}else{
				if(map.containsKey(entry.getKey()+k)){
					pairs++;
				}
			}
		}
		
	    return pairs;    
    }
}