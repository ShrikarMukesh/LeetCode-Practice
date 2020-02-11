package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate(nums));
	}
	public static boolean containsDuplicate(int[] nums) {

		Set<Integer> hashSet = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			if(hashSet.contains(nums[i])) {
				return true;
			}
			hashSet.add(nums[i]);
		}
		return false;
	}
	public static boolean containsDuplicate2(int[] nums) {

		Arrays.sort(nums);
		for(int i=0;i< nums.length -1;i++) {
			if(nums[i] == nums[i+1]) {
				return true;
			}
		}
		return false;
	}
}
