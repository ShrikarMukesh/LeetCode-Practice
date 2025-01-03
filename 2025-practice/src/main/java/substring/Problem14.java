package main.java.substring;
//Longest Subarray of 1s After Deleting One Element (LeetCode 1493)
public class Problem14 {
    public static void main(String[] args) {
        //LeetCode 14. Longest Common Prefix Solution Explained - Java
        String[] strs = {"flower","flow","flight"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i= 1;i<strs.length;i++){
            while (strs[i].indexOf(prefix) != 0 ){
                prefix = prefix.substring(0, prefix.length() -1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
