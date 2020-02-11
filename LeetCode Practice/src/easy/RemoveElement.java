package easy;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = {3,2,2,3};
		int val = 3;
		System.out.println(removeElement1(nums,val));
		
		int[] nums2 = {0,1,2,2,3,0,4,2};
		int val1 = 2;
		System.out.println(removeElement1(nums2,val1));
	}
    public static int removeElement1(int[] nums, int val) {
		
		int valid_size =0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != val) {
				nums[valid_size] = nums[i];
				valid_size++;
			}
		}
        return valid_size;
	}
	public static int removeElement2(int[] nums, int val) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == val) {
				continue;
			}else {
				arrayList.add(nums[i]);
			}
		}
		Iterator<Integer> iter = arrayList.iterator();
		while (iter.hasNext()) { 
            System.out.print(iter.next() + " "); 
        } 
		System.out.println();
        return arrayList.size();
	}
}
