package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = {2,2,1,1,1,2,2,7,5,5,6,3,4,4,3};
		System.out.println(majorityElement1(nums));
		System.out.println(majorityElement2(nums));
	}
	public static int majorityElement1(int[] nums) {
		
		Arrays.sort(nums);
		Set<Integer> set = new TreeSet<>();	
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count =0;
		for(int i=0;i<nums.length;i++) {
			
			boolean flag = set.add(nums[i]);
			if(flag==true) {
				map.put(nums[i], 1);
			}else{
				count = map.get(nums[i]);
				map.put(nums[i], ++count);
			}
		}
		Map.Entry<Integer, Integer> maxEntry = null;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			
		    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
		        maxEntry = entry;
		    }
		}
		int result = maxEntry.getKey();
		return result;
	}
	public static int majorityElement2(int[] nums) {
		
		if(nums.length == 1) {
			return nums[0];
		}
		HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
		for(int i : nums) {
			if(hashMap.containsKey(i) && hashMap.get(i)+1 > nums.length/2) {
				return i;
			}else {
				 hashMap.put(i, hashMap.getOrDefault(i, 0)+1);
			}
		}
		return -1;	
	}
}
