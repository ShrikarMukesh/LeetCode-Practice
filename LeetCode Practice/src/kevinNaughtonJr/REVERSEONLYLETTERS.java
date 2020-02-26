package kevinNaughtonJr;

public class REVERSEONLYLETTERS {
	public static void main(String[] args) {
		String s ="ab-cd";
		String s1 ="a-bC-dEf-ghIj";
		String output = reverseOnlyLetters(s);
		String output1 = reverseOnlyLetters(s1);
		System.out.println(output);
		System.out.println(output1);
	}
	public static String reverseOnlyLetters(String S) {
		char[] characters = S.toCharArray();
		int i=0;
		int j=S.length()-1;
		while(i<j) {
			while(i<j &&  !Character.isLetter(S.charAt(i))) {
				i++;
			}
			while(j>i &&  !Character.isLetter(S.charAt(j))) {
				j--;
			}
			char temp =characters[i];
			characters[i] = characters[j];
			characters[j]=temp;
			i++;
			j--;
		}
		
		return new String(characters);
	}
}
