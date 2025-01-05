package main.java.string;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MatchingCharsInStrings {
    public static void main(String[] args) {
        String str1 = "aabcddekll12@";
        String str2 = "bb2211@55k";

        count(str1, str2);
    }

    public static void count(String str1, String str2) {
        //Not Thread Safe -- Not Synchronised
        LinkedHashSet<Character> characterHashSet = new LinkedHashSet<>();
        for (int i =0;i<str1.length();i++){
            for (int j=0;j<str2.length();j++){
                if (str1.charAt(i) == str2.charAt(j)){
                    characterHashSet.add(str1.charAt(i));
                }
            }
        }
        System.out.println(characterHashSet);
    }
}
