package codesignal;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate {
	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 3, 2};
		System.out.println(findFirstDuplicate1(a));
		System.out.println(findFirstDuplicate2(a));
	}
	private static int findFirstDuplicate1(int[] a) {

		int find =0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(set.contains(a[i]) == true) {
				find = a[i];
				return find;
			}else {
				set.add(a[i]);
			}
		}
		return find;
	}
	private static int findFirstDuplicate2(int[] a) {

		int min_second_index = a.length;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i] == a[j]) {
					min_second_index=Math.min(min_second_index, j);
				}
			}
		}
		if(min_second_index == a.length) {
			return -1;
		}else {
			return a[min_second_index];
		}
		
	}
}
