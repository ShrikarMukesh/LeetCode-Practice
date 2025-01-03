package main.java.substring;

//3. Longest Substring Without Repeating Characters
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("shrikar"));

    }
    public static int lengthOfLongestSubstring(String str) {
         int i_pointer = 0;
         int j_pointer = 0;
         int max = 0;
         LinkedHashSet<Character> integerHashSet = new LinkedHashSet<>();

         while (j_pointer < str.length()){
             if ( ! (integerHashSet.contains(str.charAt(j_pointer)))) {
                 integerHashSet.add(str.charAt(j_pointer));
                 j_pointer++;
                 max = Math.max(integerHashSet.size(), max);
             }
             else {
                 integerHashSet.remove(str.charAt(i_pointer));
                 i_pointer++;
             }
         }
         return max;
    }
}
