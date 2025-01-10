package main.java.basicanagrams;

public class CheckAnagrams {
    public static void main(String[] args) {

        System.out.println(checkAnagrams("listen", "silent")); // true
        System.out.println(checkAnagrams("hello", "world"));   // false
        System.out.println(checkAnagrams("triangle", "integral")); // true
    }
    public static boolean checkAnagrams(String str1, String str2) {
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Create frequency arrays for both strings
        int[] frequency1 = new int[26]; // Assuming only lowercase letters
        int[] frequency2 = new int[26];

        // Populate the frequency arrays
        for (int i = 0; i < str1.length(); i++) {
            frequency1[str1.charAt(i) - 'a']++;
            frequency2[str2.charAt(i) - 'a']++;
        }

        // Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

}
