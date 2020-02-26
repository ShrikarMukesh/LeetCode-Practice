package codesignal;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		productOfArrayExceptSelf1(a);
		productOfArrayExceptSelf2(a);
	}
	static void productOfArrayExceptSelf1(int[] a){
		int product = 1;
		for(int i=0;i<a.length;i++) {
			product = product *a[i];
		}
		System.out.println(product);
		int[] result = new int[a.length];

		for(int i=0;i<result.length;i++) {
			result[i] = product / a[i];
		}
		for(int i:result) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void productOfArrayExceptSelf2(int[] a){
		int N =a.length;
		int[] left_products = new int[N];
		int[] right_products = new int[N];
		int[] out_putArray = new int[N];
		left_products[0] = 1;
		right_products[N-1] = 1;
		
		for(int i=1;i<N;i++) {
			left_products[i] = a[i-1] * left_products[i-1];
		}
		for(int i=N-2;i>=00;i--) {
			right_products[i] = a[i+1] * right_products[i+1];
		}
		for(int i=0;i<N;i++) {
			out_putArray[i] = left_products[i] * right_products[i];
		}
		System.out.println("Left Products array");
		for(int i:left_products) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Right Products array");
		for(int i:right_products) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Output array");
		for(int o: out_putArray) {
			System.out.print(o+" ");
		}
	}
}
