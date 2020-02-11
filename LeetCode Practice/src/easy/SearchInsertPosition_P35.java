package easy;

public class SearchInsertPosition_P35 {
	public static void main(String[] args) {
		int[] nums = {1,3,5,6};
		int val = 5;
		System.out.println(searchInsert(nums,val));
	}
	public static int searchInsert(int[] nums, int target) {

		int count =0;
		for(int i:nums) {
			if(i == target || i>target) {
				return count;
			}
			count++;
		}
		return nums.length;
	}
}