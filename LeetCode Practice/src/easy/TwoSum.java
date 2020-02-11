package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums ={2,7,11,15}; int target = 9;
		int[] result = new int[2];
		result = twoSum(nums, target);
		for(int i: result) {
			System.out.print(i+ " ");
		}
		System.out.println();
		result = twoSum2(nums, target);
		for(int i: result) {
			System.out.print(i+ " ");
		}
	}
	//second approach
	public static int[] twoSum2(int[] nums,int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i= 0;i<nums.length;i++) {
             int flag = target - nums[i];
             if(map.containsKey(flag)) {
            	 return new int[]{map.get(flag),i};
             }
             map.put(nums[i], i);
		}
		throw new IllegalArgumentException("no match found");
	}
	//First approach
	public static int[] twoSum(int[] nums,int target) {
		for(int i= 0;i<nums.length;i++) {

			for(int j=i+1;j<nums.length;j++) {
				int flag = target - nums[i];
				if(nums[j] == flag) {
					return new int[]{i,j};
				}
			}
		}
		throw new IllegalArgumentException("no match found");
	}
}
