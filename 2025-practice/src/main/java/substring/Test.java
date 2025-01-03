package main.java.substring;

public class Test {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String res = longestCommonPrefix(strs);
        System.out.println(res);
        //
        indexOfExamples();
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i= 1;i<strs.length;i++){

            while (strs[i].indexOf(prefix) != 0 ){
                int str = strs[i].indexOf(prefix);
                System.out.println(str);
                prefix = prefix.substring(0, prefix.length() -1);
                System.out.println(prefix);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;

    }

    public static void indexOfExamples() {
        String text = "hello world, welcome to Java programming!";

        // 1. Find the index of the first occurrence of a character
        int index1 = text.indexOf('o');
        System.out.println("First occurrence of 'o': " + index1);

        // 2. Find the index of a character starting from a specific index
        int index2 = text.indexOf('o', 5);
        System.out.println("Occurrence of 'o' after index 5: " + index2);

        // 3. Find the index of a substring
        int index3 = text.indexOf("welcome");
        System.out.println("Index of substring 'welcome': " + index3);

        // 4. Find the index of a substring starting from a specific index
        int index4 = text.indexOf("Java", 10);
        System.out.println("Index of substring 'Java' after index 10: " + index4);

        // 5. Character or substring not found
        int index5 = text.indexOf('z');
        System.out.println("Index of character 'z' (not found): " + index5);

        int index6 = text.indexOf("Python");
        System.out.println("Index of substring 'Python' (not found): " + index6);
    }
}
