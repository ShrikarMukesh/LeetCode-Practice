package easy;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		
		String myStr = "flower";
	    System.out.println(myStr.indexOf("flow"));
	    
		String[] strs = {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	public static String longestCommonPrefix(String[] strs) {

		if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++) {
        	while(strs[i].indexOf(prefix) != 0) {
        		prefix = prefix.substring(0,prefix.length() -1 );
        	}
        }
        return prefix;
	}
}
