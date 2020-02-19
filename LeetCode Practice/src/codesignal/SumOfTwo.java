package codesignal;
import java.util.HashSet;
public class SumOfTwo {
	public static void main(String[] args) {
		int[] a = {1,2,3};int[] b = {10,20,30,40};
		int v=42;
		System.out.println(sumOfTwo1(a, b, v));
		
		System.out.println("Using Hashset");
		int[] a1 = {0,0,-5,30152};int[] b1 = {-10,40,-3,9};
		int v1=-8;
		System.out.println(sumOfTwo2(a1, b1, v1));	
	}
	static boolean sumOfTwo1(int[] a,int[] b,int v) {
		for(int i=0;i<a.length;i++) {
			int needed_value = v - a[i];
			for(int j=0;j<b.length;j++) {
				if(b[j] == needed_value) {
					System.out.println("Sumed values are "+"a=  "+a[i]+" "+"b= "+b[j]);
					return true;
				}
			}
		}
		return false;
	}
	static boolean sumOfTwo2(int[] a,int[] b,int v) {
		HashSet<Integer> differences = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			int difference = v - a[i];
			differences.add(difference);
		}
		for(int i =0;i<b.length;i++) {
			if(differences.contains(b[i])) {
				return true;
			}
		}
		return false;
	}
}
