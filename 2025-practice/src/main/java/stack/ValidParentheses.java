package main.java.stack;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        char[] charArr = s.toCharArray();
        Stack<Character> stack = new Stack();
        for (int i=0;i<charArr.length;i++) {
             if (charArr[i] == '(' || charArr[i] == '{' || charArr[i] == '[' ){
                 stack.push(charArr[i]);
             }
             else {
                 if (stack.isEmpty()) return false;
                 char top = stack.pop();
                 if (charArr[i] == ')' && top != '(' ||
                         charArr[i] == ']' && top != '[' ||
                         charArr[i] == '}' && top != '{'
                 ){
                     return false;
                 }
             }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "()[]{}";
        String s2 = "(]";
        String s3 = "([{}])";

        System.out.println("Is valid: " + isValid(s1)); // Output: true
        System.out.println("Is valid: " + isValid(s2)); // Output: false
        System.out.println("Is valid: " + isValid(s3)); // Output: true
    }
}
