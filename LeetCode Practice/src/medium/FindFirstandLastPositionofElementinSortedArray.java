package medium;

public class FindFirstandLastPositionofElementinSortedArray {
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] result = new int[2];
		result[0] = findStartingIndex(nums,target);
		result[1] = findEndingIndex(nums,target);
		for(int i: result) {
			System.out.println(i);
		}
	}
	private static int findStartingIndex(int[] nums, int target) {

		int index =-1;
		int start =0;
		int end = nums.length-1;
		while(start<= end) {
			int mid = start + (end-start)/2;
			if(nums[mid]>=target) {
				end = mid -1;
			}else {
				start = mid+1;
			}
			if(nums[mid] == target) {
				index = mid;
			}
		}
		return index;
	}
	private static int findEndingIndex(int[] nums, int target) {
		int index =-1;
		int start =0;
		int end = nums.length-1;
		while(start<= end) {
			int mid = start + (end-start)/2;
			if(nums[mid]<=target) {
				start = mid +1;
			}else {
			    end = mid -1;
			}
			if(nums[mid] == target) {
				index = mid;
			}
		}
		return index;
	}
}
