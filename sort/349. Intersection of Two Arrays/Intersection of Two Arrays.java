public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
		int j = 0;
		boolean ifStart = false;
		ArrayList<Integer> common = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
        	if(nums1[i] == nums2[j]){
        		if(!common.isEmpty()){
        			int tmp = common.get(common.size()-1);
        			if(tmp != nums1[i]){
        				common.add(nums1[i]);
        			}
        		}else{
        			common.add(nums1[i]);
        		}
        		i++;
				j++;
        	}
        	else if(nums1[i]<nums2[j]){
        		i++;
        	}else if(nums1[i]>nums2[j]){
        		j++;
        	}
        }
        int[] result = new int[common.size()];
        int k = 0;
        Iterator<Integer> iterator = common.iterator();
        while(iterator.hasNext()){
        	result[k++] = iterator.next();
        }
        return result;
    }
}