package kevinNaughtonJr;

public class MergeSortedArray {
	public static void main(String[] args) {

		int[] nums1 = {1,3,5,8,8};
		int[] nums2 = {2,4,6};
		int[] res = merge(nums1,nums1.length,nums2,nums2.length);
		for(int i:res) {
			System.out.print(i+" ");
		}
	}
	public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

		int[] result = new int[nums1.length+nums2.length];
		int i = 0,j = 0,k = 0;  
		while(i<m && j<n) {
			
			if(nums1[i] < nums2[j]) {
				result[k] = nums1[i];
				k++;i++;
				
			}else {
				result[k] = nums2[j];
				k++;
				j++;
			}
			
		}
		while(i<m) {
			result[k] = nums1[i];
			k++;i++;
		}
		while(j<n) {
			result[k] = nums2[j];
			k++;j++;
		}
		return result;
	}
}
