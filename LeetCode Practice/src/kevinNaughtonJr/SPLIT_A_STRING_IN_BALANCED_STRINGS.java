package kevinNaughtonJr;

class SPLIT_A_STRING_IN_BALANCED_STRINGS {
	public static void main(String[] args) {
		
		//s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'
		System.out.println(balanecedStringSplit("RLRRLLRLRL"));
		//s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
		System.out.println(balanecedStringSplit("RLLLLRRRLR"));
		int flag = 0;
		System.out.println(--flag);
		
	}
	public static int balanecedStringSplit(String s) {

		int count =0;
		int balancedCount =0;
		for(int i=0;i<s.length();i++) {
			
			char current = s.charAt(i);
			if(current == 'L') {
				count++;
			}else if(current == 'R'){
				count--;
			}
			if(count == 0) {
				balancedCount++;
			}
		}
		return balancedCount;
	}
}
