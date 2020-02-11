package easy;

public class DetectCapital {
	public static void main(String[] args) {
       String word1 = "USA";
       String word2 = "FlaG";
       System.out.println(detectCapitalUse(word1));
       System.out.println(detectCapitalUse(word2));
	}
	public static boolean detectCapitalUse(String word) {
		
		int count =0;
		for(int i=0;i<word.length();i++) {
			if(Character.isUpperCase(word.charAt(i))) {
				count++;
			}
		}
		if(count == word.length() || count ==0 || count==1 && Character.isUpperCase(word.charAt(0))) {
			return true;
		}
		return false;
	}
}
