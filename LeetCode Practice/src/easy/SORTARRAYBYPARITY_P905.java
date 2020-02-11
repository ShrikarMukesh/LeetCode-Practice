package easy;

public class SORTARRAYBYPARITY_P905 {
	public static void main(String[] args) {
        int[] A = {3,1,2,4};
		int[] result = sortArrayByParity(A);
		for(int i: result) {
			System.out.print(i+ " ");
		}
	}
	public static int[] sortArrayByParity(int[] A) {
		int index =0;
		for(int i=0;i<A.length;i++){
			if(A[i] % 2 == 0){
				int temp = A[index];
				A[index] = A[i];
				A[i] = temp;
				index++;
			}
		}
		return A;
	}
}
