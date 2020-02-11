package easy;

public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = "Hello world I am";
		System.out.println(lengthOfLastWord(s));
	}
	public static int lengthOfLastWord(String s) {
		int flag =0;
		String[] sArray = s.split(" ");
		for(int i=sArray.length-1;i>=0;) {
			flag = sArray[i].length();
			return flag;
		}
		return flag;
	}
}
