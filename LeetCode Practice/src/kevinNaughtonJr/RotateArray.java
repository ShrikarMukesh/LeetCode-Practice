package kevinNaughtonJr;

public class RotateArray {
	public static void main(String[] args) {
         int[] a = {1,2,3,4,5};
         int rotation = 2;
         rotate(a,rotation);
	}

	private static void rotate(int[] a, int rotation) {
		int result[]  = new int[a.length];
		while(rotation>0) {
			int flag = a[a.length-1];
			for(int i=0;i<a.length-1;i++) {
				a[i] = a[i+1]; 
			}
			result[0] = flag;
			rotation--;
		}
		for(int h:a) {
			System.out.println(h);
		}
	}
}
