package codesignal;

import java.util.Arrays;

public class SortedSquaredArray {
	public static void main(String[] args) {
		
       int[] array = {-6,-5,4,3,1,2,7};
       int[] result = sortedSquaredArray1(array);
       for(int a:result) {
    	   System.out.print(a+" ");
       }
       System.out.println("2nd approach with N time complexity");
       int[] result2 = sortedSquaredArray2(array);
       for(int a:result2) {
    	   System.out.print(a+" ");
       }
	}
	
	private static int[] sortedSquaredArray2(int[] a) {
		int[] result = new int[a.length];
		int left =0;
		int right = a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(Math.abs(a[left]) > a[right]){
				result[i] = a[left] * a[left];
				left++;
			}else {
				result[i] = a[right] * a[right];
				right--;
			}
		}
		return result;
	}
	//nlogn time complexity
	private static int[] sortedSquaredArray1(int[] a) {
		int[] result = new int[a.length];
		for(int i=0;i<a.length;i++) {
			result[i] = a[i] * a[i];
		}
		Arrays.sort(result);
		return result;
	}
}
