package easy;

public class PlusOne_P66 {
	public static void main(String[] args) {
        int[] digits = {8,9,9};
        int[] output = pulsOne(digits);
        
        for(int i:output) {
        	System.out.print(i+" ");
        }
        System.out.println();
        int[] digits1 = {1,9,9};
        int[] output1 = pulsOne2(digits1);
        for(int i:output1) {
        	System.out.print(i+" ");
        }
	}
	private static int[] pulsOne(int[] digits) {
		for(int i = digits.length-1;i>=0;i--) {
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[digits.length+1];
		result[0] = 1;
		return result;
	}
	private static int[] pulsOne2(int[] a) {
		String s="";
		for(int i=0;i<a.length;i++){
			s=s+a[i];
		}
		int n=Integer.parseInt(s);
		int num=n+1;
		String s1=String.valueOf(num);
		char[] b=s1.toCharArray();
		int[] result = new int[a.length];
		for(int i=0;i<b.length;i++){
			result[i] = b[i];
		}
		return result;
	}
	
}
