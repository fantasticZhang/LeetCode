public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
		int j = 0;
		ArrayList<Integer> common = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
        	if(nums1[i] == nums2[j]){
        		common.add(nums1[i]);
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